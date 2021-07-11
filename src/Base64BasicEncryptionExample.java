package com;

import java.util.Base64;


public class Base64BasicEncryptionExample {
	public static void main(String[] args) {
		// Encoding string
		String str = Base64.getEncoder().encodeToString("JavaTpoint".getBytes());
		System.out.println("Encoded string: " + str);
		// Getting decoder
		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		String dStr = new String(decoder.decode(str));
		System.out.println("Decoded string: " + dStr);
	}
}
