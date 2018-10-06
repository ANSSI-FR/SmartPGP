package fr.anssi.smartpgp;


public final class Data {

    public static final byte INS_TEST_RANDOM = (byte)0x00;
    public static final byte INS_TEST_RSA = (byte)0x01;
    public static final byte INS_TEST_RSA_CRT = (byte)0x02;
    public static final byte INS_TEST_EC = (byte)0x03;

    public static final short SW_FAILED_TO_BUILD_PRIV_KEY = (short)0x6500;
    public static final short SW_FAILED_TO_BUILD_PUB_KEY = (short)0x6501;
    public static final short SW_PRIV_KEY_NOT_INITIALIZED = (short)0x6502;
    public static final short SW_PUB_KEY_NOT_INITIALIZED = (short)0x6503;


    public static final short BUFFER_RED_LENGTH = (short)0x200;
    public static final short BUFFER_BLACK_LENGTH = (short)0x200;


    public static final byte[] RSA_1024_PUB_MODULUS_N = {
        (byte)0x83, (byte)0x93, (byte)0x4B, (byte)0xA6, (byte)0x5B, (byte)0xFC, (byte)0x8C, (byte)0x67,
        (byte)0xC9, (byte)0x39, (byte)0x4F, (byte)0x1A, (byte)0xFA, (byte)0x9D, (byte)0x3F, (byte)0x10,
        (byte)0x25, (byte)0xBD, (byte)0x8D, (byte)0xC1, (byte)0x3B, (byte)0x56, (byte)0x6B, (byte)0x36,
        (byte)0x44, (byte)0x63, (byte)0xA6, (byte)0xE2, (byte)0xF7, (byte)0x72, (byte)0x39, (byte)0x1C,
        (byte)0x72, (byte)0x2D, (byte)0x07, (byte)0x0B, (byte)0xA4, (byte)0xED, (byte)0x2C, (byte)0xDC,
        (byte)0x1A, (byte)0x46, (byte)0xDD, (byte)0x58, (byte)0xF1, (byte)0xC1, (byte)0x87, (byte)0xBA,
        (byte)0x61, (byte)0x53, (byte)0x47, (byte)0x2B, (byte)0x63, (byte)0xFD, (byte)0xF5, (byte)0x68,
        (byte)0xB3, (byte)0x2D, (byte)0x34, (byte)0xF4, (byte)0x46, (byte)0x45, (byte)0x28, (byte)0xE6,
        (byte)0x71, (byte)0x1B, (byte)0xDE, (byte)0x6D, (byte)0xC2, (byte)0x7A, (byte)0x8E, (byte)0xDC,
        (byte)0xD0, (byte)0x63, (byte)0x10, (byte)0x14, (byte)0xCC, (byte)0x58, (byte)0x55, (byte)0xDB,
        (byte)0xD6, (byte)0xDE, (byte)0x73, (byte)0xB5, (byte)0x06, (byte)0x04, (byte)0x4B, (byte)0x0B,
        (byte)0x0F, (byte)0x2F, (byte)0x06, (byte)0x08, (byte)0x2A, (byte)0xF6, (byte)0x8F, (byte)0x18,
        (byte)0x5F, (byte)0x1F, (byte)0x88, (byte)0x80, (byte)0x4C, (byte)0xF9, (byte)0xA7, (byte)0x1B,
        (byte)0x04, (byte)0x86, (byte)0x44, (byte)0x53, (byte)0xF0, (byte)0x29, (byte)0x70, (byte)0x1E,
        (byte)0x2E, (byte)0x97, (byte)0x63, (byte)0x40, (byte)0x91, (byte)0x1E, (byte)0x97, (byte)0xC0,
        (byte)0xB7, (byte)0x12, (byte)0x7D, (byte)0xDD, (byte)0xD0, (byte)0x7C, (byte)0x4A, (byte)0xB7
    };

    public static final byte[] RSA_1024_PUB_EXPONENT_E = {
        (byte)0x01, (byte)0x00, (byte)0x01
    };

    public static final byte[] RSA_1024_PRIV_EXPONENT_D = {
        (byte)0x4E, (byte)0xDD, (byte)0x50, (byte)0xF0, (byte)0xCC, (byte)0x1E, (byte)0x1A, (byte)0x42,
        (byte)0x73, (byte)0x38, (byte)0x68, (byte)0x93, (byte)0xF1, (byte)0x37, (byte)0xA3, (byte)0x7F,
        (byte)0x18, (byte)0x3F, (byte)0xFF, (byte)0xE1, (byte)0x9C, (byte)0xA1, (byte)0x75, (byte)0xED,
        (byte)0xB7, (byte)0x1C, (byte)0x4C, (byte)0x01, (byte)0xAA, (byte)0xF3, (byte)0xCA, (byte)0x0B,
        (byte)0xA4, (byte)0xDC, (byte)0x1C, (byte)0x66, (byte)0xFC, (byte)0x5A, (byte)0x35, (byte)0x13,
        (byte)0x50, (byte)0xA4, (byte)0xBD, (byte)0x33, (byte)0xFC, (byte)0xE4, (byte)0x55, (byte)0x68,
        (byte)0x7F, (byte)0xC1, (byte)0x9C, (byte)0xDD, (byte)0x03, (byte)0x38, (byte)0x4B, (byte)0x8A,
        (byte)0x90, (byte)0x2B, (byte)0x3E, (byte)0x9C, (byte)0x54, (byte)0x2A, (byte)0x4C, (byte)0x12,
        (byte)0xC8, (byte)0x12, (byte)0xD2, (byte)0x54, (byte)0x64, (byte)0xDA, (byte)0xB7, (byte)0x88,
        (byte)0x15, (byte)0xD2, (byte)0xC8, (byte)0x28, (byte)0x7F, (byte)0xFA, (byte)0x35, (byte)0x94,
        (byte)0x96, (byte)0x97, (byte)0xB8, (byte)0x3E, (byte)0xEE, (byte)0xC4, (byte)0x37, (byte)0xF6,
        (byte)0xC9, (byte)0x2F, (byte)0xA2, (byte)0x21, (byte)0x49, (byte)0xDD, (byte)0xD5, (byte)0x33,
        (byte)0x6C, (byte)0x7A, (byte)0x8A, (byte)0x10, (byte)0xCF, (byte)0x16, (byte)0x5F, (byte)0x3E,
        (byte)0xED, (byte)0x42, (byte)0xF4, (byte)0xFB, (byte)0xFC, (byte)0x36, (byte)0x24, (byte)0x93,
        (byte)0xD7, (byte)0xD6, (byte)0x8C, (byte)0x36, (byte)0x41, (byte)0xA0, (byte)0xD3, (byte)0x6C,
        (byte)0xFA, (byte)0x01, (byte)0x5E, (byte)0xBB, (byte)0x61, (byte)0x88, (byte)0xDE, (byte)0x81
    };

    public static final byte[] RSA_1024_PRIV_PRIME_P = {
        (byte)0xBB, (byte)0xC7, (byte)0x92, (byte)0x7F, (byte)0x74, (byte)0xC2, (byte)0xA5, (byte)0x5E,
        (byte)0x98, (byte)0x80, (byte)0x59, (byte)0xF0, (byte)0x1F, (byte)0xF7, (byte)0x50, (byte)0x11,
        (byte)0xA9, (byte)0xED, (byte)0x03, (byte)0x5C, (byte)0x11, (byte)0x33, (byte)0xD1, (byte)0x68,
        (byte)0x90, (byte)0x79, (byte)0xE6, (byte)0xAA, (byte)0xDE, (byte)0xDD, (byte)0xC6, (byte)0x41,
        (byte)0xFF, (byte)0x79, (byte)0x49, (byte)0xB1, (byte)0x57, (byte)0x95, (byte)0x71, (byte)0x2A,
        (byte)0x4B, (byte)0xDC, (byte)0x66, (byte)0xFD, (byte)0x88, (byte)0x1D, (byte)0x33, (byte)0xA1,
        (byte)0xA8, (byte)0x6F, (byte)0xA2, (byte)0x57, (byte)0x29, (byte)0x1B, (byte)0xFF, (byte)0x9B,
        (byte)0xB9, (byte)0x62, (byte)0x34, (byte)0x10, (byte)0xF0, (byte)0xD1, (byte)0x67, (byte)0x97
    };

    public static final byte[] RSA_1024_PRIV_PRIME_Q = {
        (byte)0xB3, (byte)0x60, (byte)0x74, (byte)0x64, (byte)0xB5, (byte)0x9A, (byte)0xD8, (byte)0x05,
        (byte)0xB5, (byte)0xE4, (byte)0x6B, (byte)0x47, (byte)0xE7, (byte)0x3C, (byte)0x59, (byte)0x12,
        (byte)0x51, (byte)0x40, (byte)0xF4, (byte)0x1D, (byte)0xD7, (byte)0x38, (byte)0x42, (byte)0x81,
        (byte)0xF1, (byte)0x10, (byte)0x92, (byte)0xBF, (byte)0x82, (byte)0x16, (byte)0xD5, (byte)0xE3,
        (byte)0xA4, (byte)0xF0, (byte)0x2B, (byte)0xA0, (byte)0x6E, (byte)0xCE, (byte)0xE0, (byte)0xE2,
        (byte)0xA0, (byte)0xD9, (byte)0xEB, (byte)0x51, (byte)0x1B, (byte)0x5A, (byte)0xEA, (byte)0xCA,
        (byte)0x26, (byte)0xCF, (byte)0x2F, (byte)0xFE, (byte)0xB4, (byte)0x6F, (byte)0x29, (byte)0x0B,
        (byte)0x58, (byte)0x06, (byte)0x55, (byte)0x6B, (byte)0xF3, (byte)0x91, (byte)0x99, (byte)0xE1
    };

    public static final byte[] RSA_1024_PRIV_PQ = {
        (byte)0x99, (byte)0x8F, (byte)0x65, (byte)0x40, (byte)0x98, (byte)0xC0, (byte)0xB8, (byte)0x3C,
        (byte)0x27, (byte)0xD4, (byte)0xE5, (byte)0x5C, (byte)0x56, (byte)0x2F, (byte)0xEB, (byte)0x9F,
        (byte)0x37, (byte)0x74, (byte)0xD1, (byte)0xB5, (byte)0xF8, (byte)0x50, (byte)0x42, (byte)0x2B,
        (byte)0xDA, (byte)0x57, (byte)0x39, (byte)0x73, (byte)0xCE, (byte)0xBA, (byte)0x52, (byte)0x06,
        (byte)0x14, (byte)0xE7, (byte)0x45, (byte)0x27, (byte)0xB9, (byte)0xCF, (byte)0x6D, (byte)0x87,
        (byte)0x41, (byte)0x81, (byte)0x74, (byte)0x1D, (byte)0xD3, (byte)0xC0, (byte)0x1E, (byte)0x4A,
        (byte)0x48, (byte)0x87, (byte)0x82, (byte)0xBC, (byte)0x31, (byte)0x94, (byte)0xEA, (byte)0xCC,
        (byte)0xA8, (byte)0xF6, (byte)0xF7, (byte)0x86, (byte)0x61, (byte)0xD7, (byte)0x6C, (byte)0x75
    };

    public static final byte[] RSA_1024_PRIV_EXPONENT_DP1 = {
        (byte)0xB4, (byte)0xF7, (byte)0x4D, (byte)0x78, (byte)0xE5, (byte)0xD6, (byte)0x9C, (byte)0x36,
        (byte)0x80, (byte)0xF3, (byte)0xD9, (byte)0x39, (byte)0x30, (byte)0x25, (byte)0x50, (byte)0x95,
        (byte)0xE5, (byte)0x54, (byte)0x54, (byte)0x53, (byte)0x8B, (byte)0x04, (byte)0x8C, (byte)0x40,
        (byte)0xA0, (byte)0x53, (byte)0xCA, (byte)0x78, (byte)0x4B, (byte)0xD6, (byte)0x21, (byte)0x36,
        (byte)0x03, (byte)0x76, (byte)0x29, (byte)0x0D, (byte)0xEE, (byte)0xE1, (byte)0x47, (byte)0xB1,
        (byte)0x42, (byte)0x70, (byte)0xC3, (byte)0x14, (byte)0x7C, (byte)0xF3, (byte)0xDF, (byte)0x89,
        (byte)0x60, (byte)0xE1, (byte)0x4C, (byte)0xEB, (byte)0x80, (byte)0xE3, (byte)0xC9, (byte)0xBF,
        (byte)0x92, (byte)0xB6, (byte)0x50, (byte)0x85, (byte)0x2F, (byte)0x00, (byte)0x30, (byte)0x3B
    };

    public static final byte[] RSA_1024_PRIV_EXPONENT_DQ1 = {
        (byte)0x14, (byte)0xDD, (byte)0x48, (byte)0x4C, (byte)0x9A, (byte)0x8F, (byte)0x1B, (byte)0x47,
        (byte)0x76, (byte)0xC3, (byte)0xCD, (byte)0xF2, (byte)0xBC, (byte)0x23, (byte)0xD9, (byte)0xDC,
        (byte)0x76, (byte)0x95, (byte)0x0E, (byte)0x90, (byte)0x16, (byte)0x03, (byte)0x96, (byte)0x40,
        (byte)0xD5, (byte)0x10, (byte)0x6F, (byte)0x71, (byte)0x55, (byte)0x29, (byte)0x60, (byte)0xD1,
        (byte)0xAC, (byte)0xD2, (byte)0xBE, (byte)0xD0, (byte)0x57, (byte)0x73, (byte)0x3A, (byte)0xD7,
        (byte)0x41, (byte)0x8C, (byte)0x77, (byte)0x81, (byte)0xA4, (byte)0xA3, (byte)0xEB, (byte)0xA1,
        (byte)0x7D, (byte)0xE8, (byte)0x25, (byte)0x96, (byte)0x03, (byte)0xD8, (byte)0xD6, (byte)0x36,
        (byte)0x5A, (byte)0x93, (byte)0xCA, (byte)0x05, (byte)0xD7, (byte)0x7B, (byte)0xFD, (byte)0x21
    };





    public static final byte[] RSA_2048_PUB_MODULUS_N = {
        (byte)0xae, (byte)0x45, (byte)0xed, (byte)0x56, (byte)0x01, (byte)0xce, (byte)0xc6, (byte)0xb8,
        (byte)0xcc, (byte)0x05, (byte)0xf8, (byte)0x03, (byte)0x93, (byte)0x5c, (byte)0x67, (byte)0x4d,
        (byte)0xdb, (byte)0xe0, (byte)0xd7, (byte)0x5c, (byte)0x4c, (byte)0x09, (byte)0xfd, (byte)0x79,
        (byte)0x51, (byte)0xfc, (byte)0x6b, (byte)0x0c, (byte)0xae, (byte)0xc3, (byte)0x13, (byte)0xa8,
        (byte)0xdf, (byte)0x39, (byte)0x97, (byte)0x0c, (byte)0x51, (byte)0x8b, (byte)0xff, (byte)0xba,
        (byte)0x5e, (byte)0xd6, (byte)0x8f, (byte)0x3f, (byte)0x0d, (byte)0x7f, (byte)0x22, (byte)0xa4,
        (byte)0x02, (byte)0x9d, (byte)0x41, (byte)0x3f, (byte)0x1a, (byte)0xe0, (byte)0x7e, (byte)0x4e,
        (byte)0xbe, (byte)0x9e, (byte)0x41, (byte)0x77, (byte)0xce, (byte)0x23, (byte)0xe7, (byte)0xf5,
        (byte)0x40, (byte)0x4b, (byte)0x56, (byte)0x9e, (byte)0x4e, (byte)0xe1, (byte)0xbd, (byte)0xcf,
        (byte)0x3c, (byte)0x1f, (byte)0xb0, (byte)0x3e, (byte)0xf1, (byte)0x13, (byte)0x80, (byte)0x2d,
        (byte)0x4f, (byte)0x85, (byte)0x5e, (byte)0xb9, (byte)0xb5, (byte)0x13, (byte)0x4b, (byte)0x5a,
        (byte)0x7c, (byte)0x80, (byte)0x85, (byte)0xad, (byte)0xca, (byte)0xe6, (byte)0xfa, (byte)0x2f,
        (byte)0xa1, (byte)0x41, (byte)0x7e, (byte)0xc3, (byte)0x76, (byte)0x3b, (byte)0xe1, (byte)0x71,
        (byte)0xb0, (byte)0xc6, (byte)0x2b, (byte)0x76, (byte)0x0e, (byte)0xde, (byte)0x23, (byte)0xc1,
        (byte)0x2a, (byte)0xd9, (byte)0x2b, (byte)0x98, (byte)0x08, (byte)0x84, (byte)0xc6, (byte)0x41,
        (byte)0xf5, (byte)0xa8, (byte)0xfa, (byte)0xc2, (byte)0x6b, (byte)0xda, (byte)0xd4, (byte)0xa0,
        (byte)0x33, (byte)0x81, (byte)0xa2, (byte)0x2f, (byte)0xe1, (byte)0xb7, (byte)0x54, (byte)0x88,
        (byte)0x50, (byte)0x94, (byte)0xc8, (byte)0x25, (byte)0x06, (byte)0xd4, (byte)0x01, (byte)0x9a,
        (byte)0x53, (byte)0x5a, (byte)0x28, (byte)0x6a, (byte)0xfe, (byte)0xb2, (byte)0x71, (byte)0xbb,
        (byte)0x9b, (byte)0xa5, (byte)0x92, (byte)0xde, (byte)0x18, (byte)0xdc, (byte)0xf6, (byte)0x00,
        (byte)0xc2, (byte)0xae, (byte)0xea, (byte)0xe5, (byte)0x6e, (byte)0x02, (byte)0xf7, (byte)0xcf,
        (byte)0x79, (byte)0xfc, (byte)0x14, (byte)0xcf, (byte)0x3b, (byte)0xdc, (byte)0x7c, (byte)0xd8,
        (byte)0x4f, (byte)0xeb, (byte)0xbb, (byte)0xf9, (byte)0x50, (byte)0xca, (byte)0x90, (byte)0x30,
        (byte)0x4b, (byte)0x22, (byte)0x19, (byte)0xa7, (byte)0xaa, (byte)0x06, (byte)0x3a, (byte)0xef,
        (byte)0xa2, (byte)0xc3, (byte)0xc1, (byte)0x98, (byte)0x0e, (byte)0x56, (byte)0x0c, (byte)0xd6,
        (byte)0x4a, (byte)0xfe, (byte)0x77, (byte)0x95, (byte)0x85, (byte)0xb6, (byte)0x10, (byte)0x76,
        (byte)0x57, (byte)0xb9, (byte)0x57, (byte)0x85, (byte)0x7e, (byte)0xfd, (byte)0xe6, (byte)0x01,
        (byte)0x09, (byte)0x88, (byte)0xab, (byte)0x7d, (byte)0xe4, (byte)0x17, (byte)0xfc, (byte)0x88,
        (byte)0xd8, (byte)0xf3, (byte)0x84, (byte)0xc4, (byte)0xe6, (byte)0xe7, (byte)0x2c, (byte)0x3f,
        (byte)0x94, (byte)0x3e, (byte)0x0c, (byte)0x31, (byte)0xc0, (byte)0xc4, (byte)0xa5, (byte)0xcc,
        (byte)0x36, (byte)0xf8, (byte)0x79, (byte)0xd8, (byte)0xa3, (byte)0xac, (byte)0x9d, (byte)0x7d,
        (byte)0x59, (byte)0x86, (byte)0x0e, (byte)0xaa, (byte)0xda, (byte)0x6b, (byte)0x83, (byte)0xbb
    };

    public static final byte[] RSA_2048_PUB_EXPONENT_E = {
        (byte)0x01, (byte)0x00, (byte)0x01
    };

    public static final byte[] RSA_2048_PRIV_EXPONENT_D = {
        (byte)0x05, (byte)0x6b, (byte)0x04, (byte)0x21, (byte)0x6f, (byte)0xe5, (byte)0xf3, (byte)0x54,
        (byte)0xac, (byte)0x77, (byte)0x25, (byte)0x0a, (byte)0x4b, (byte)0x6b, (byte)0x0c, (byte)0x85,
        (byte)0x25, (byte)0xa8, (byte)0x5c, (byte)0x59, (byte)0xb0, (byte)0xbd, (byte)0x80, (byte)0xc5,
        (byte)0x64, (byte)0x50, (byte)0xa2, (byte)0x2d, (byte)0x5f, (byte)0x43, (byte)0x8e, (byte)0x59,
        (byte)0x6a, (byte)0x33, (byte)0x3a, (byte)0xa8, (byte)0x75, (byte)0xe2, (byte)0x91, (byte)0xdd,
        (byte)0x43, (byte)0xf4, (byte)0x8c, (byte)0xb8, (byte)0x8b, (byte)0x9d, (byte)0x5f, (byte)0xc0,
        (byte)0xd4, (byte)0x99, (byte)0xf9, (byte)0xfc, (byte)0xd1, (byte)0xc3, (byte)0x97, (byte)0xf9,
        (byte)0xaf, (byte)0xc0, (byte)0x70, (byte)0xcd, (byte)0x9e, (byte)0x39, (byte)0x8c, (byte)0x8d,
        (byte)0x19, (byte)0xe6, (byte)0x1d, (byte)0xb7, (byte)0xc7, (byte)0x41, (byte)0x0a, (byte)0x6b,
        (byte)0x26, (byte)0x75, (byte)0xdf, (byte)0xbf, (byte)0x5d, (byte)0x34, (byte)0x5b, (byte)0x80,
        (byte)0x4d, (byte)0x20, (byte)0x1a, (byte)0xdd, (byte)0x50, (byte)0x2d, (byte)0x5c, (byte)0xe2,
        (byte)0xdf, (byte)0xcb, (byte)0x09, (byte)0x1c, (byte)0xe9, (byte)0x99, (byte)0x7b, (byte)0xbe,
        (byte)0xbe, (byte)0x57, (byte)0x30, (byte)0x6f, (byte)0x38, (byte)0x3e, (byte)0x4d, (byte)0x58,
        (byte)0x81, (byte)0x03, (byte)0xf0, (byte)0x36, (byte)0xf7, (byte)0xe8, (byte)0x5d, (byte)0x19,
        (byte)0x34, (byte)0xd1, (byte)0x52, (byte)0xa3, (byte)0x23, (byte)0xe4, (byte)0xa8, (byte)0xdb,
        (byte)0x45, (byte)0x1d, (byte)0x6f, (byte)0x4a, (byte)0x5b, (byte)0x1b, (byte)0x0f, (byte)0x10,
        (byte)0x2c, (byte)0xc1, (byte)0x50, (byte)0xe0, (byte)0x2f, (byte)0xee, (byte)0xe2, (byte)0xb8,
        (byte)0x8d, (byte)0xea, (byte)0x4a, (byte)0xd4, (byte)0xc1, (byte)0xba, (byte)0xcc, (byte)0xb2,
        (byte)0x4d, (byte)0x84, (byte)0x07, (byte)0x2d, (byte)0x14, (byte)0xe1, (byte)0xd2, (byte)0x4a,
        (byte)0x67, (byte)0x71, (byte)0xf7, (byte)0x40, (byte)0x8e, (byte)0xe3, (byte)0x05, (byte)0x64,
        (byte)0xfb, (byte)0x86, (byte)0xd4, (byte)0x39, (byte)0x3a, (byte)0x34, (byte)0xbc, (byte)0xf0,
        (byte)0xb7, (byte)0x88, (byte)0x50, (byte)0x1d, (byte)0x19, (byte)0x33, (byte)0x03, (byte)0xf1,
        (byte)0x3a, (byte)0x22, (byte)0x84, (byte)0xb0, (byte)0x01, (byte)0xf0, (byte)0xf6, (byte)0x49,
        (byte)0xea, (byte)0xf7, (byte)0x93, (byte)0x28, (byte)0xd4, (byte)0xac, (byte)0x5c, (byte)0x43,
        (byte)0x0a, (byte)0xb4, (byte)0x41, (byte)0x49, (byte)0x20, (byte)0xa9, (byte)0x46, (byte)0x0e,
        (byte)0xd1, (byte)0xb7, (byte)0xbc, (byte)0x40, (byte)0xec, (byte)0x65, (byte)0x3e, (byte)0x87,
        (byte)0x6d, (byte)0x09, (byte)0xab, (byte)0xc5, (byte)0x09, (byte)0xae, (byte)0x45, (byte)0xb5,
        (byte)0x25, (byte)0x19, (byte)0x01, (byte)0x16, (byte)0xa0, (byte)0xc2, (byte)0x61, (byte)0x01,
        (byte)0x84, (byte)0x82, (byte)0x98, (byte)0x50, (byte)0x9c, (byte)0x1c, (byte)0x3b, (byte)0xf3,
        (byte)0xa4, (byte)0x83, (byte)0xe7, (byte)0x27, (byte)0x40, (byte)0x54, (byte)0xe1, (byte)0x5e,
        (byte)0x97, (byte)0x07, (byte)0x50, (byte)0x36, (byte)0xe9, (byte)0x89, (byte)0xf6, (byte)0x09,
        (byte)0x32, (byte)0x80, (byte)0x7b, (byte)0x52, (byte)0x57, (byte)0x75, (byte)0x1e, (byte)0x79
    };

    public static final byte[] RSA_2048_PRIV_PRIME_P = {
        (byte)0xec, (byte)0xf5, (byte)0xae, (byte)0xcd, (byte)0x1e, (byte)0x55, (byte)0x15, (byte)0xff,
        (byte)0xfa, (byte)0xcb, (byte)0xd7, (byte)0x5a, (byte)0x28, (byte)0x16, (byte)0xc6, (byte)0xeb,
        (byte)0xf4, (byte)0x90, (byte)0x18, (byte)0xcd, (byte)0xfb, (byte)0x46, (byte)0x38, (byte)0xe1,
        (byte)0x85, (byte)0xd6, (byte)0x6a, (byte)0x73, (byte)0x96, (byte)0xb6, (byte)0xf8, (byte)0x09,
        (byte)0x0f, (byte)0x80, (byte)0x18, (byte)0xc7, (byte)0xfd, (byte)0x95, (byte)0xcc, (byte)0x34,
        (byte)0xb8, (byte)0x57, (byte)0xdc, (byte)0x17, (byte)0xf0, (byte)0xcc, (byte)0x65, (byte)0x16,
        (byte)0xbb, (byte)0x13, (byte)0x46, (byte)0xab, (byte)0x4d, (byte)0x58, (byte)0x2c, (byte)0xad,
        (byte)0xad, (byte)0x7b, (byte)0x41, (byte)0x03, (byte)0x35, (byte)0x23, (byte)0x87, (byte)0xb7,
        (byte)0x03, (byte)0x38, (byte)0xd0, (byte)0x84, (byte)0x04, (byte)0x7c, (byte)0x9d, (byte)0x95,
        (byte)0x39, (byte)0xb6, (byte)0x49, (byte)0x62, (byte)0x04, (byte)0xb3, (byte)0xdd, (byte)0x6e,
        (byte)0xa4, (byte)0x42, (byte)0x49, (byte)0x92, (byte)0x07, (byte)0xbe, (byte)0xc0, (byte)0x1f,
        (byte)0x96, (byte)0x42, (byte)0x87, (byte)0xff, (byte)0x63, (byte)0x36, (byte)0xc3, (byte)0x98,
        (byte)0x46, (byte)0x58, (byte)0x33, (byte)0x68, (byte)0x46, (byte)0xf5, (byte)0x6e, (byte)0x46,
        (byte)0x86, (byte)0x18, (byte)0x81, (byte)0xc1, (byte)0x02, (byte)0x33, (byte)0xd2, (byte)0x17,
        (byte)0x6b, (byte)0xf1, (byte)0x5a, (byte)0x5e, (byte)0x96, (byte)0xdd, (byte)0xc7, (byte)0x80,
        (byte)0xbc, (byte)0x86, (byte)0x8a, (byte)0xa7, (byte)0x7d, (byte)0x3c, (byte)0xe7, (byte)0x69
    };

    public static final byte[] RSA_2048_PRIV_PRIME_Q = {
        (byte)0xbc, (byte)0x46, (byte)0xc4, (byte)0x64, (byte)0xfc, (byte)0x6a, (byte)0xc4, (byte)0xca,
        (byte)0x78, (byte)0x3b, (byte)0x0e, (byte)0xb0, (byte)0x8a, (byte)0x3c, (byte)0x84, (byte)0x1b,
        (byte)0x77, (byte)0x2f, (byte)0x7e, (byte)0x9b, (byte)0x2f, (byte)0x28, (byte)0xba, (byte)0xbd,
        (byte)0x58, (byte)0x8a, (byte)0xe8, (byte)0x85, (byte)0xe1, (byte)0xa0, (byte)0xc6, (byte)0x1e,
        (byte)0x48, (byte)0x58, (byte)0xa0, (byte)0xfb, (byte)0x25, (byte)0xac, (byte)0x29, (byte)0x99,
        (byte)0x90, (byte)0xf3, (byte)0x5b, (byte)0xe8, (byte)0x51, (byte)0x64, (byte)0xc2, (byte)0x59,
        (byte)0xba, (byte)0x11, (byte)0x75, (byte)0xcd, (byte)0xd7, (byte)0x19, (byte)0x27, (byte)0x07,
        (byte)0x13, (byte)0x51, (byte)0x84, (byte)0x99, (byte)0x2b, (byte)0x6c, (byte)0x29, (byte)0xb7,
        (byte)0x46, (byte)0xdd, (byte)0x0d, (byte)0x2c, (byte)0xab, (byte)0xe1, (byte)0x42, (byte)0x83,
        (byte)0x5f, (byte)0x7d, (byte)0x14, (byte)0x8c, (byte)0xc1, (byte)0x61, (byte)0x52, (byte)0x4b,
        (byte)0x4a, (byte)0x09, (byte)0x94, (byte)0x6d, (byte)0x48, (byte)0xb8, (byte)0x28, (byte)0x47,
        (byte)0x3f, (byte)0x1c, (byte)0xe7, (byte)0x6b, (byte)0x6c, (byte)0xb6, (byte)0x88, (byte)0x6c,
        (byte)0x34, (byte)0x5c, (byte)0x03, (byte)0xe0, (byte)0x5f, (byte)0x41, (byte)0xd5, (byte)0x1b,
        (byte)0x5c, (byte)0x3a, (byte)0x90, (byte)0xa3, (byte)0xf2, (byte)0x40, (byte)0x73, (byte)0xc7,
        (byte)0xd7, (byte)0x4a, (byte)0x4f, (byte)0xe2, (byte)0x5d, (byte)0x9c, (byte)0xf2, (byte)0x1c,
        (byte)0x75, (byte)0x96, (byte)0x0f, (byte)0x3f, (byte)0xc3, (byte)0x86, (byte)0x31, (byte)0x83
    };

    public static final byte[] RSA_2048_PRIV_PQ = {
        (byte)0x6f, (byte)0x38, (byte)0x52, (byte)0x6b, (byte)0x39, (byte)0x25, (byte)0x08, (byte)0x55,
        (byte)0x34, (byte)0xef, (byte)0x3e, (byte)0x41, (byte)0x5a, (byte)0x83, (byte)0x6e, (byte)0xde,
        (byte)0x8b, (byte)0x86, (byte)0x15, (byte)0x8a, (byte)0x2c, (byte)0x7c, (byte)0xbf, (byte)0xec,
        (byte)0xcb, (byte)0x0b, (byte)0xd8, (byte)0x34, (byte)0x30, (byte)0x4f, (byte)0xec, (byte)0x68,
        (byte)0x3b, (byte)0xa8, (byte)0xd4, (byte)0xf4, (byte)0x79, (byte)0xc4, (byte)0x33, (byte)0xd4,
        (byte)0x34, (byte)0x16, (byte)0xe6, (byte)0x32, (byte)0x69, (byte)0x62, (byte)0x3c, (byte)0xea,
        (byte)0x10, (byte)0x07, (byte)0x76, (byte)0xd8, (byte)0x5a, (byte)0xff, (byte)0x40, (byte)0x1d,
        (byte)0x3f, (byte)0xff, (byte)0x61, (byte)0x0e, (byte)0xe6, (byte)0x54, (byte)0x11, (byte)0xce,
        (byte)0x3b, (byte)0x13, (byte)0x63, (byte)0xd6, (byte)0x3a, (byte)0x97, (byte)0x09, (byte)0xee,
        (byte)0xde, (byte)0x42, (byte)0x64, (byte)0x7c, (byte)0xea, (byte)0x56, (byte)0x14, (byte)0x93,
        (byte)0xd5, (byte)0x45, (byte)0x70, (byte)0xa8, (byte)0x79, (byte)0xc1, (byte)0x86, (byte)0x82,
        (byte)0xcd, (byte)0x97, (byte)0x71, (byte)0x0b, (byte)0x96, (byte)0x20, (byte)0x5e, (byte)0xc3,
        (byte)0x11, (byte)0x17, (byte)0xd7, (byte)0x3b, (byte)0x5f, (byte)0x36, (byte)0x22, (byte)0x3f,
        (byte)0xad, (byte)0xd6, (byte)0xe8, (byte)0xba, (byte)0x90, (byte)0xdd, (byte)0x7c, (byte)0x0e,
        (byte)0xe6, (byte)0x1d, (byte)0x44, (byte)0xe1, (byte)0x63, (byte)0x25, (byte)0x1e, (byte)0x20,
        (byte)0xc7, (byte)0xf6, (byte)0x6e, (byte)0xb3, (byte)0x05, (byte)0x11, (byte)0x7c, (byte)0xb8
    };

    public static final byte[] RSA_2048_PRIV_EXPONENT_DP1 = {
        (byte)0xc7, (byte)0x35, (byte)0x64, (byte)0x57, (byte)0x1d, (byte)0x00, (byte)0xfb, (byte)0x15,
        (byte)0xd0, (byte)0x8a, (byte)0x3d, (byte)0xe9, (byte)0x95, (byte)0x7a, (byte)0x50, (byte)0x91,
        (byte)0x5d, (byte)0x71, (byte)0x26, (byte)0xe9, (byte)0x44, (byte)0x2d, (byte)0xac, (byte)0xf4,
        (byte)0x2b, (byte)0xc8, (byte)0x2e, (byte)0x86, (byte)0x2e, (byte)0x56, (byte)0x73, (byte)0xff,
        (byte)0x6a, (byte)0x00, (byte)0x8e, (byte)0xd4, (byte)0xd2, (byte)0xe3, (byte)0x74, (byte)0x61,
        (byte)0x7d, (byte)0xf8, (byte)0x9f, (byte)0x17, (byte)0xa1, (byte)0x60, (byte)0xb4, (byte)0x3b,
        (byte)0x7f, (byte)0xda, (byte)0x9c, (byte)0xb6, (byte)0xb6, (byte)0xb7, (byte)0x42, (byte)0x18,
        (byte)0x60, (byte)0x98, (byte)0x15, (byte)0xf7, (byte)0xd4, (byte)0x5c, (byte)0xa2, (byte)0x63,
        (byte)0xc1, (byte)0x59, (byte)0xaa, (byte)0x32, (byte)0xd2, (byte)0x72, (byte)0xd1, (byte)0x27,
        (byte)0xfa, (byte)0xf4, (byte)0xbc, (byte)0x8c, (byte)0xa2, (byte)0xd7, (byte)0x73, (byte)0x78,
        (byte)0xe8, (byte)0xae, (byte)0xb1, (byte)0x9b, (byte)0x0a, (byte)0xd7, (byte)0xda, (byte)0x3c,
        (byte)0xb3, (byte)0xde, (byte)0x0a, (byte)0xe7, (byte)0x31, (byte)0x49, (byte)0x80, (byte)0xf6,
        (byte)0x2b, (byte)0x6d, (byte)0x4b, (byte)0x0a, (byte)0x87, (byte)0x5d, (byte)0x1d, (byte)0xf0,
        (byte)0x3c, (byte)0x1b, (byte)0xae, (byte)0x39, (byte)0xcc, (byte)0xd8, (byte)0x33, (byte)0xef,
        (byte)0x6c, (byte)0xd7, (byte)0xe2, (byte)0xd9, (byte)0x52, (byte)0x8b, (byte)0xf0, (byte)0x84,
        (byte)0xd1, (byte)0xf9, (byte)0x69, (byte)0xe7, (byte)0x94, (byte)0xe9, (byte)0xf6, (byte)0xc1
    };

    public static final byte[] RSA_2048_PRIV_EXPONENT_DQ1 = {
        (byte)0x26, (byte)0x58, (byte)0xb3, (byte)0x7f, (byte)0x6d, (byte)0xf9, (byte)0xc1, (byte)0x03,
        (byte)0x0b, (byte)0xe1, (byte)0xdb, (byte)0x68, (byte)0x11, (byte)0x7f, (byte)0xa9, (byte)0xd8,
        (byte)0x7e, (byte)0x39, (byte)0xea, (byte)0x2b, (byte)0x69, (byte)0x3b, (byte)0x7e, (byte)0x6d,
        (byte)0x3a, (byte)0x2f, (byte)0x70, (byte)0x94, (byte)0x74, (byte)0x13, (byte)0xee, (byte)0xc6,
        (byte)0x14, (byte)0x2e, (byte)0x18, (byte)0xfb, (byte)0x8d, (byte)0xfc, (byte)0xb6, (byte)0xac,
        (byte)0x54, (byte)0x5d, (byte)0x7c, (byte)0x86, (byte)0xa0, (byte)0xad, (byte)0x48, (byte)0xf8,
        (byte)0x45, (byte)0x71, (byte)0x70, (byte)0xf0, (byte)0xef, (byte)0xb2, (byte)0x6b, (byte)0xc4,
        (byte)0x81, (byte)0x26, (byte)0xc5, (byte)0x3e, (byte)0xfd, (byte)0x1d, (byte)0x16, (byte)0x92,
        (byte)0x01, (byte)0x98, (byte)0xdc, (byte)0x2a, (byte)0x11, (byte)0x07, (byte)0xdc, (byte)0x28,
        (byte)0x2d, (byte)0xb6, (byte)0xa8, (byte)0x0c, (byte)0xd3, (byte)0x06, (byte)0x23, (byte)0x60,
        (byte)0xba, (byte)0x3f, (byte)0xa1, (byte)0x3f, (byte)0x70, (byte)0xe4, (byte)0x31, (byte)0x2f,
        (byte)0xf1, (byte)0xa6, (byte)0xcd, (byte)0x6b, (byte)0x8f, (byte)0xc4, (byte)0xcd, (byte)0x9c,
        (byte)0x5c, (byte)0x3d, (byte)0xb1, (byte)0x7c, (byte)0x6d, (byte)0x6a, (byte)0x57, (byte)0x21,
        (byte)0x2f, (byte)0x73, (byte)0xae, (byte)0x29, (byte)0xf6, (byte)0x19, (byte)0x32, (byte)0x7b,
        (byte)0xad, (byte)0x59, (byte)0xb1, (byte)0x53, (byte)0x85, (byte)0x85, (byte)0x85, (byte)0xba,
        (byte)0x4e, (byte)0x28, (byte)0xb6, (byte)0x0a, (byte)0x62, (byte)0xa4, (byte)0x5e, (byte)0x49
    };



    public static final byte[] EC_ANSIX9P256R1_S = {
        (byte)0x80, (byte)0x50, (byte)0x3b, (byte)0x7e, (byte)0xbf, (byte)0x80, (byte)0x1b, (byte)0x0b,
        (byte)0xda, (byte)0x82, (byte)0xdd, (byte)0xb7, (byte)0x69, (byte)0x7b, (byte)0x9b, (byte)0x4b,
        (byte)0x20, (byte)0x27, (byte)0x5a, (byte)0x28, (byte)0x3e, (byte)0x69, (byte)0x38, (byte)0xbf,
        (byte)0x1c, (byte)0x23, (byte)0xa7, (byte)0x8d, (byte)0x2f, (byte)0x1c, (byte)0x08, (byte)0x3b
    };

    public static final byte[] EC_ANSIX9P256R1_W = {
        (byte)0x04, (byte)0xa0, (byte)0xa0, (byte)0xa9, (byte)0x46, (byte)0x88, (byte)0x66, (byte)0xb9,
        (byte)0xe7, (byte)0x1c, (byte)0x0c, (byte)0x63, (byte)0x20, (byte)0x7a, (byte)0x8b, (byte)0xd6,
        (byte)0xc7, (byte)0xc8, (byte)0xf0, (byte)0xaa, (byte)0x2a, (byte)0x78, (byte)0xd4, (byte)0xc3,
        (byte)0x15, (byte)0x33, (byte)0x67, (byte)0xcf, (byte)0xee, (byte)0xcc, (byte)0xfe, (byte)0xa6,
        (byte)0x39, (byte)0xdc, (byte)0x72, (byte)0xd5, (byte)0xaa, (byte)0xf1, (byte)0xc5, (byte)0xc2,
        (byte)0x08, (byte)0x2f, (byte)0xda, (byte)0x6f, (byte)0x65, (byte)0x79, (byte)0x6b, (byte)0xf4,
        (byte)0x1c, (byte)0x8c, (byte)0x9a, (byte)0xc0, (byte)0xfe, (byte)0x28, (byte)0x85, (byte)0x83,
        (byte)0xfa, (byte)0x63, (byte)0x73, (byte)0x57, (byte)0x78, (byte)0x46, (byte)0xf8, (byte)0x1d,
        (byte)0x2A
    };



    public static final byte[] EC_ANSIX9P521R1_S = {
        (byte)0x00, (byte)0x3a, (byte)0x13, (byte)0x8d, (byte)0x9e, (byte)0x20, (byte)0x8d, (byte)0xfe,
        (byte)0xe2, (byte)0x29, (byte)0x25, (byte)0x14, (byte)0x1e, (byte)0x2d, (byte)0x29, (byte)0xca,
        (byte)0xdd, (byte)0xe5, (byte)0x33, (byte)0x1c, (byte)0x9a, (byte)0xf0, (byte)0x9a, (byte)0x72,
        (byte)0x39, (byte)0x4c, (byte)0x9b, (byte)0x82, (byte)0x94, (byte)0xe0, (byte)0x59, (byte)0x86,
        (byte)0xe5, (byte)0xc2, (byte)0xd4, (byte)0x9d, (byte)0xf0, (byte)0xdb, (byte)0x0d, (byte)0xdc,
        (byte)0x2c, (byte)0xe4, (byte)0x59, (byte)0x66, (byte)0xcd, (byte)0x3a, (byte)0x6f, (byte)0x45,
        (byte)0x7d, (byte)0xc2, (byte)0xc8, (byte)0x94, (byte)0xc0, (byte)0x98, (byte)0xbe, (byte)0x93,
        (byte)0x2f, (byte)0x51, (byte)0x5b, (byte)0xe6, (byte)0xbb, (byte)0x34, (byte)0xc8, (byte)0xe9,
        (byte)0x33, (byte)0x98
    };

    public static final byte[] EC_ANSIX9P521R1_W = {
        (byte)0x04, (byte)0x01, (byte)0xce, (byte)0xfd, (byte)0x49, (byte)0x2c, (byte)0xd2, (byte)0xf3,
        (byte)0x5c, (byte)0x45, (byte)0x98, (byte)0x3c, (byte)0x45, (byte)0xcd, (byte)0x49, (byte)0x73,
        (byte)0x82, (byte)0x5a, (byte)0x7a, (byte)0x7b, (byte)0x54, (byte)0xc6, (byte)0xd1, (byte)0x66,
        (byte)0x71, (byte)0x5d, (byte)0x31, (byte)0x0e, (byte)0xd3, (byte)0x0d, (byte)0x60, (byte)0x9a,
        (byte)0x13, (byte)0x08, (byte)0x4e, (byte)0x97, (byte)0x5e, (byte)0x85, (byte)0xfe, (byte)0xd9,
        (byte)0xd9, (byte)0xbc, (byte)0x08, (byte)0xfd, (byte)0x16, (byte)0xc7, (byte)0x43, (byte)0x2b,
        (byte)0x80, (byte)0x8d, (byte)0xe5, (byte)0xeb, (byte)0xcf, (byte)0x46, (byte)0x6c, (byte)0xed,
        (byte)0xb4, (byte)0x51, (byte)0x10, (byte)0xde, (byte)0xa1, (byte)0x3e, (byte)0x95, (byte)0x0f,
        (byte)0xfd, (byte)0xc5, (byte)0x4b, (byte)0x01, (byte)0x16, (byte)0xcc, (byte)0xf6, (byte)0x2b,
        (byte)0x3c, (byte)0xa7, (byte)0xe7, (byte)0x05, (byte)0x6c, (byte)0xc0, (byte)0x13, (byte)0xcc,
        (byte)0xee, (byte)0xfc, (byte)0x45, (byte)0x48, (byte)0xe7, (byte)0xff, (byte)0xc2, (byte)0xfe,
        (byte)0xb4, (byte)0x63, (byte)0xaf, (byte)0xb0, (byte)0xc1, (byte)0xb7, (byte)0x56, (byte)0xab,
        (byte)0x1a, (byte)0x57, (byte)0x82, (byte)0x06, (byte)0xd4, (byte)0xea, (byte)0x77, (byte)0xb8,
        (byte)0x1b, (byte)0xf8, (byte)0x3e, (byte)0x8c, (byte)0x86, (byte)0x6a, (byte)0xd7, (byte)0x52,
        (byte)0x9a, (byte)0xe8, (byte)0x22, (byte)0x7a, (byte)0xac, (byte)0x62, (byte)0x72, (byte)0x89,
        (byte)0xb4, (byte)0x9c, (byte)0x9f, (byte)0xfa, (byte)0x1b, (byte)0x6a, (byte)0xbb, (byte)0xfd,
        (byte)0x4d, (byte)0x98, (byte)0xf2, (byte)0x81, (byte)0xdc
    };

}
