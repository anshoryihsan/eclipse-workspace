package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar;
import com.dicoding.javafundamental.basic.obyek.Hewan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("'aajsaj'");

		Gitar.bunyi();
		Mobil.jumlahBan();
		Kereta.jumlahBan();
		Motor.jumlahBan();

		Hewan Elang = new Hewan("Elang");
		Elang.beratHewan(21);
		Elang.jumlahKakiHewan(4);
		Elang.cetakHewan();

	}

}
