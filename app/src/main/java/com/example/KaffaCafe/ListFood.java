package com.example.KaffaCafe;

import android.content.Context;

import java.util.ArrayList;

public class ListFood{


    public static ArrayList<Integer> getGambar() {
        ArrayList<Integer> drawables = new ArrayList<Integer>();
        drawables.add(R.drawable.black_salad);
        drawables.add(R.drawable.kopi_hitam);
        drawables.add(R.drawable.nasigoreng);
        drawables.add(R.drawable.batagor);
        drawables.add(R.drawable.cheesecake);
        drawables.add(R.drawable.cappuchino);
        drawables.add(R.drawable.cireng);
        drawables.add(R.drawable.sparkling_tea);
        drawables.add(R.drawable.donut);
        drawables.add(R.drawable.mie_goreng);

        return drawables;
    }

    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Black Salad","Black Salad adalah salah satu hidangan salad andalan KaffaCafe. Cita rasa Black Salad akan menjadi teman kopi maupun teh anda.", "Rp. 50.000", context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Kopi Hitam", "Kopi Hitam Racikan khas barista kami. Rasa kopi hitam yang otentik akan memberikan pengalaman ngopi anda semakin berharga", "Rp. 10.000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Nasi Goreng","Nasi Goreng Andalan kami dibuat oleh chef handal yang akan memanjakan lidah dan ngisi perut anda. Dengan daging sapi yang lembut dan mixed vegetables, dijamin uang anda tidaklah terbuang sia sia.", "Rp. 15.000", context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Batagor","Batagor yang digoreng kering dengan bumbu kacang resep turun temurun dijamin akan memberikan pengalaman jajanan kaki lima.", "Rp. 5.000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Cheese Cake", "Cheesecake ini merupakan kebanggaan salah satu pegawai kami. sepotong cheesecake lembut dengan saus beri diatasnya akan memanjakan lidah anda para pecinta cheesecake.", "Rp. 25.000", context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Cappuccino","Kopi Cappuchino dengan racikan khas yang dibuat agar anda dapat menikmati Cappuchino dengan maksimal", "Rp. 15.000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Cireng","Aci nu digoreng, dengan resep ibunda tercipta.", "Rp. 5.000", context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Lemon Sparkling Tea","Cita rasa Sparkling Tea yang tidak akan anda lupakan.", "Rp. 20.000", context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Donut","Donut manis dengan berbagai macam topping yang bisa anda nikmati bersama dengan secangkir kopi pilihan anda", "Rp. 5.000", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Mie Goreng","", "Rp. 10.000", context.getDrawable(R.drawable.mie_goreng)));

        return list;
    }
}
