public class DataTypes {
    public static void main(String args[]){
		boolean v=true;	    // range: 0 or 1
		char ch='R';		//range: 16bits (or) 2 bytes [0-65535]
		byte b=120;		    //range: 8bits (or) 1 byte [-2^7 to 2^7 -1]
		short s=1000;		//range: 16bits (or) 2 bytes [-2^15 to 2^15 -1]
		int i=10000;		//range: 32bits (or) 4 bytes [-2^31 to 2^31 -1]
		long l=100000L; 	//range: 64bits (or) 8 bytes [-2^63 to 2^63 -1]
		float f =3.14327F;	//range: 16bits (or) 2 bytes [-2^31 to 2^31 -1]
		double d=98.5;	    //range: 64bits (or) 8 bytes [-2^63 to 2^63 -1]
		System.out.println(v);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}
}
