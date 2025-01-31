/*
 * Copyright (c) 2001, 2020, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package java.security.spec;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class RSAMultiPrimePrivateCrtKeySpec extends java.security.spec.RSAPrivateKeySpec {

public RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger modulus, java.math.BigInteger publicExponent, java.math.BigInteger privateExponent, java.math.BigInteger primeP, java.math.BigInteger primeQ, java.math.BigInteger primeExponentP, java.math.BigInteger primeExponentQ, java.math.BigInteger crtCoefficient, java.security.spec.RSAOtherPrimeInfo[] otherPrimeInfo) { super((java.math.BigInteger)null, (java.math.BigInteger)null); throw new RuntimeException("Stub!"); }

@android.annotation.FlaggedApi(com.android.libcore.Flags.FLAG_V_APIS)
public RSAMultiPrimePrivateCrtKeySpec(java.math.BigInteger modulus, java.math.BigInteger publicExponent, java.math.BigInteger privateExponent, java.math.BigInteger primeP, java.math.BigInteger primeQ, java.math.BigInteger primeExponentP, java.math.BigInteger primeExponentQ, java.math.BigInteger crtCoefficient, java.security.spec.RSAOtherPrimeInfo[] otherPrimeInfo, java.security.spec.AlgorithmParameterSpec keyParams) { super((java.math.BigInteger)null, (java.math.BigInteger)null); throw new RuntimeException("Stub!"); }

public java.math.BigInteger getPublicExponent() { throw new RuntimeException("Stub!"); }

public java.math.BigInteger getPrimeP() { throw new RuntimeException("Stub!"); }

public java.math.BigInteger getPrimeQ() { throw new RuntimeException("Stub!"); }

public java.math.BigInteger getPrimeExponentP() { throw new RuntimeException("Stub!"); }

public java.math.BigInteger getPrimeExponentQ() { throw new RuntimeException("Stub!"); }

public java.math.BigInteger getCrtCoefficient() { throw new RuntimeException("Stub!"); }

public java.security.spec.RSAOtherPrimeInfo[] getOtherPrimeInfo() { throw new RuntimeException("Stub!"); }
}

