package com.example.bai7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class main1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
    }
    // khai báo gia cua san pham
    int banhmi=15000;
    int comga=35000;
    int miquang=30000;
    int pho=20000;

    // khai báo so luong cua san pham
    int count_banhmi=0;
    int count_comga=0;
    int count_miquang=0;
    int count_pho=0;
    // khai bao tong tien cua san pham
    int dolar;

    // tạo nút nhấn button cho banh mi`
    public void banhmi_btn(View view){
        // cập nhat so luong
        String dialog_banhmi = "Số lượng: ";
        // hien thi so luong banh mi`
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        // hien thi tong tien cua banh' mi`
        TextView tong=(TextView) findViewById(R.id.tongtien);
        // Bien đếm cua banh' mi` cho san pham tang len
        count_banhmi++;
        dialog_banhmi += count_banhmi;  //(dau += thay the gia tri cu~)
        // lay gia tien cua banh' mi` * vs so luong cua banh' mi` + tat ca cac san pham
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_banhmi.setText(dialog_banhmi);
    }

    public void comga_btn(View view){
        String dialog_comga = "Số lượng: ";
        TextView soluong_comga = (TextView) findViewById(R.id.soluong_comga);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_comga++;
        dialog_comga += count_comga;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_comga.setText(dialog_comga);
    }

    public void miquang_btn(View view){
        String dialog_miquang = "Số lượng: ";
        TextView soluong_miquang = (TextView) findViewById(R.id.soluong_miquang);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_miquang++;
        dialog_miquang += count_miquang;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_miquang.setText(dialog_miquang);
    }

    public void pho_btn(View view){
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong=(TextView) findViewById(R.id.tongtien);
        count_pho++;
        dialog_pho += count_pho;
        dolar = banhmi*count_banhmi + comga*count_comga + miquang*count_miquang + pho*count_pho;
        tong.setText(dolar + "VND");
        soluong_pho.setText(dialog_pho);
    }

    public void huy_btn (View view){
        String dialog_banhmi= "Số lượng: ";
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        String dialog_comga = "Số lượng: ";
        TextView soluong_comga = (TextView) findViewById(R.id.soluong_comga);
        String dialog_miquang = "Số lượng: ";
        TextView soluong_miquang = (TextView) findViewById(R.id.soluong_miquang);
        String dialog_pho = "Số lượng: ";
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong = (TextView) findViewById(R.id.tongtien);
        count_banhmi=0;
        count_comga=0;
        count_pho=0;
        count_miquang=0;
        dialog_banhmi += count_banhmi;
        dialog_comga += count_comga;
        dialog_pho += count_pho;
        dialog_miquang += count_miquang;
        soluong_banhmi.setText(dialog_banhmi);
        soluong_comga.setText(dialog_comga);
        soluong_pho.setText(dialog_pho);
        soluong_miquang.setText(dialog_miquang);
        tong.setText("0 VND");
    }
    public void xoa_btn (View view) {
        TextView soluong_banhmi = (TextView) findViewById(R.id.soluong_banhmi);
        TextView soluong_comga = (TextView) findViewById(R.id.soluong_comga);
        TextView soluong_miquang = (TextView) findViewById(R.id.soluong_miquang);
        TextView soluong_pho = (TextView) findViewById(R.id.soluong_pho);
        TextView tong = (TextView) findViewById(R.id.tongtien);

        soluong_banhmi.setText(0);
        soluong_comga.setText(0);
        soluong_miquang.setText(0);
        soluong_pho.setText(0);
        tong.setText(" ");
    }
    public void pay_btn(View view){
        if(count_banhmi != 0 || count_comga != 0 || count_miquang !=0 || count_pho != 0)
        {
            // lẹnh intent la khi ma` thuc hien cai view moi thì nó se~ chuyen qua layout ke tiep
            Intent intent = new Intent(main1.this, main2.class);
            startActivity(intent);
        }
    }


}



