package com.example.myapplication.Catalogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myapplication.add_varient.AcivityAddVarient;
import com.example.myapplication.Catalogue.Fragment.ProductFrgment;
import com.example.myapplication.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.textfield.TextInputEditText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddProductDescription extends AppCompatActivity {
    public static  TextInputEditText Producrt_Name,Product_Detail,Product_Mrp,Product_Discount,Product_Category;
    ImageView Product_Image;
    Button BtnDesc;
    LinearLayout AddVarient_Layout;
    TextView txtNewPrice,txtOffPrice;
    String t;
    Dialog MyDialog;
    public static SharedPreferences sharedPreferences;
    public static SharedPreferences.Editor myEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product_description);
        Producrt_Name=findViewById(R.id.product_name);
        Product_Detail=findViewById(R.id.product_Ditails);
        Product_Mrp=findViewById(R.id.Product_MRP);
        Product_Discount=findViewById(R.id.product_Discount);
        Product_Category=findViewById(R.id.product_catName);
        Product_Image=findViewById(R.id.Product_Picture);
        BtnDesc=findViewById(R.id.AddProduct_descButton);
        AddVarient_Layout=findViewById(R.id.Add_varientlinear);
        txtNewPrice=findViewById(R.id.txt_pricenew);
        txtOffPrice=findViewById(R.id.txt_discountPrice);
        t=getIntent().getStringExtra("ProductName");
        Producrt_Name.setText(t);
        MyDialog =new Dialog(this);

        sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);

// Creating an Editor object to edit(write to the file)
        myEdit = sharedPreferences.edit();



        AddVarient_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(AddProductDescription.this, AcivityAddVarient.class);
                startActivity(i);


            }
        });

        Product_Discount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.e("abcd",s.toString());

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Discount();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        BtnDesc.setOnClickListener(v -> {
            myEdit.putString("productName",Producrt_Name.getText().toString());
            myEdit.putString("ProductCategory",Product_Category.getText().toString());
            myEdit.putString("Product_Mrp",Product_Mrp.getText().toString());
            myEdit.putString("Product_Discount",Product_Discount.getText().toString());
            myEdit.putString("Product_Detail",Product_Detail.getText().toString());
            myEdit.commit();
            Intent i=new Intent(AddProductDescription.this,ProductFrgment.class);
            i.putExtra("productName",Producrt_Name.getText().toString());
            i.putExtra("ProductCategory",Product_Category.getText().toString());
            i.putExtra("Product_Mrp",Product_Mrp.getText().toString());
            i.putExtra("Product_Discount",Product_Discount.getText().toString());
            i.putExtra("Product_Detail",Product_Detail.getText().toString());

        });

        Product_Image.setOnClickListener(v -> {

            selectImage();
        });
Product_Detail.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(AddProductDescription.this,R.style.bottom_shee_dailog_theam);
        View view= LayoutInflater.from(AddProductDescription.this).
                inflate(R.layout.pop_windowproductdetail,(LinearLayout)findViewById(R.id.bottom_sheet_layout));
        bottomSheetDialog.setContentView(view);
      EditText txtEdit= view.findViewById(R.id.desc_product);
        view.findViewById(R.id.BtnDone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String productDetail=txtEdit.getText().toString();
                bottomSheetDialog.dismiss();
              Product_Detail.setText(productDetail);
            }
        });
//        view.findViewById(R.id.btn_yes).setOnClickListener(v -> {
//            notesViewModel.delete_GSM_Note(id);
//            bottomSheetDialog.dismiss();
//            finish();
//        });

        bottomSheetDialog.show();
    }
});

Product_Category.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        BottomSheetDialog bottomSheetDialog=new BottomSheetDialog(AddProductDescription.this,R.style.bottom_shee_dailog_theam);
        View view= LayoutInflater.from(AddProductDescription.this).
                inflate(R.layout.catagoryslected,(LinearLayout)findViewById(R.id.bottom_sheet_layout));
        bottomSheetDialog.setContentView(view);
        String ListCat[]={"cloths","Toyes","Electronic","Mobile"};

        ListView listCategory=view.findViewById(R.id.listCategory);
        LinearLayout linAddcat=view.findViewById(R.id.layoutC);

       LinearLayout linAddcat2=view.findViewById(R.id.linearc2);
        linAddcat2.setVisibility(View.GONE);

        final List<String> List = new ArrayList<String>(Arrays.asList(ListCat));
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(AddProductDescription.this,R.layout.simple_list_view,R.id.chck ,List);

        listCategory.setAdapter(arrayAdapter);
        view.findViewById(R.id.selectCtegory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              listCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String  Item= (arrayAdapter.getItem(position));
                      bottomSheetDialog.dismiss();
                      Product_Category.setText(Item);
                  }
              });

            }
        });
        view.findViewById(R.id.AddCAtegory_popup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               linAddcat.setVisibility(View.GONE);
                linAddcat2.setVisibility(View.VISIBLE);
                view.findViewById(R.id.AddCategory).setOnClickListener(v1 -> {
                    EditText edtCategory=view.findViewById(R.id.catgaory_name);
                 String newCat =edtCategory.getText().toString();
                 arrayAdapter.add(newCat);

//                BottomSheetDialog bottomSheetDialog1=new BottomSheetDialog(AddProductDescription.this,R.style.bottom_shee_dailog_theam);
//                View view= LayoutInflater.from(AddProductDescription.this).
//                        inflate(R.layout.addnewcatgorypopup,(LinearLayout)findViewById(R.id.bottom_sheet_layout));
//                bottomSheetDialog.setContentView(view);
//                view.findViewById(R.id.AddCategory).setOnClickListener(v1 -> {
//                    EditText edtCategory=view.findViewById(R.id.catgaory_name);
//                 String newCat =edtCategory.getText().toString();
//
//                 arrayAdapter.add(newCat);
               });
            }
        });

        bottomSheetDialog.show();
    }
});

    }
    public void Discount(){
        int MRP = Integer.parseInt(Product_Mrp.getText().toString());
        int Discount = Integer.parseInt(Product_Discount.getText().toString());

//        if(MRP!=0 && Discount!=0) {
            int NewPrice =(MRP - Discount);
            Log.e("ab", String.valueOf(MRP));
            Log.e("abc", String.valueOf(NewPrice));
            Log.e("abd", String.valueOf(Discount));
            double off=(NewPrice/MRP);
            Log.e("abd2", String.valueOf(off));


            double h = off*100;
            Log.e("tag", String.valueOf(h));
//            int NewDiscount = (Integer.parseInt(NewPrice) * 100) / 100;
            txtNewPrice.setText("Price:" + Discount);
            txtOffPrice.setText(h + "%off");

//        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds options to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    private void selectImage() {
        final CharSequence[] options = { "Take Photo", "Choose from Gallery","Cancel" };
        AlertDialog.Builder builder = new AlertDialog.Builder(AddProductDescription.this);
        builder.setTitle("Add Photo!");
        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                if (options[item].equals("Take Photo"))
                {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    File f = new File(android.os.Environment.getExternalStorageDirectory(), "temp.jpg");
                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));
                    startActivityForResult(intent, 1);
                }
                else if (options[item].equals("Choose from Gallery"))
                {
                    Intent intent = new   Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(intent, 2);
                }
                else if (options[item].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }
    @SuppressLint("LongLogTag")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                File f = new File(Environment.getExternalStorageDirectory().toString());
                for (File temp : f.listFiles()) {
                    if (temp.getName().equals("temp.jpg")) {
                        f = temp;
                        break;
                    }
                }
                try {
                    Bitmap bitmap;
                    BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
                    bitmap = BitmapFactory.decodeFile(f.getAbsolutePath(),
                            bitmapOptions);
                    Product_Image.setImageBitmap(bitmap);
                    String path = android.os.Environment
                            .getExternalStorageDirectory()
                            + File.separator
                            + "Phoenix" + File.separator + "default";
                    f.delete();
                    OutputStream outFile = null;
                    File file = new File(path, String.valueOf(System.currentTimeMillis()) + ".jpg");
                    try {
                        outFile = new FileOutputStream(file);
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, outFile);
                        outFile.flush();
                        outFile.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (requestCode == 2) {
                Uri selectedImage = data.getData();
                String[] filePath = { MediaStore.Images.Media.DATA };
                Cursor c = getContentResolver().query(selectedImage,filePath, null, null, null);
                c.moveToFirst();
                int columnIndex = c.getColumnIndex(filePath[0]);
                String picturePath = c.getString(columnIndex);
                c.close();
                Bitmap thumbnail = (BitmapFactory.decodeFile(picturePath));
                Log.w("path of image from gallery......******************.........", picturePath+"");
                Product_Image.setImageBitmap(thumbnail);
            }
        }
    }


}