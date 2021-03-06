#ifndef _CPP_DATATYPES_HPP_
#define _CPP_DATATYPES_HPP_
#include <vector.h>
#include <string>


typedef bool Bool;
typedef char Byte;
typedef char Char;
typedef signed short int Int8;
typedef unsigned short int UInt8;
typedef signed long int Int16;
typedef unsigned long int UInt16;
typedef signed Int32;
typedef unsigned int UInt32;
typedef signed long long Int64;
typedef unsigned long long UInt64;
typedef float Float32;
typedef double Float64;

typedef std::string String;


struct Header
{
	String frame_id;
	UInt32 seq;
};

struct MultiArrayDimension
{
	UInt32 stride;
	UInt32 size;
	String label;
};

struct MultiArrayLayout
{
	std::vector<MultiArrayDimension> dim;
	UInt32 data_offset;
};

template <typename T>
struct MultiArray
{
	std::vector<T> data;
	MultiArrayLayout layout;
};

typedef MultiArray<Byte> ByteMultiArray;
typedef MultiArray<Float32> Float32MultiArray;
typedef MultiArray<Float64> Float64MultiArray;
typedef MultiArray<Int8> Int8MultiArray;
typedef MultiArray<Int16> Int16MultiArray;
typedef MultiArray<Int32> Int32MultiArray;
typedef MultiArray<Int64> Int64MultiArray;
typedef MultiArray<UInt8> UInt8MultiArray;
typedef MultiArray<UInt16> UInt16MultiArray;
typedef MultiArray<UInt32> UInt32MultiArray;
typedef MultiArray<UInt64> UInt64MultiArray;

struct ColorRGBA
{
	Float32 r;
	Float32 g;
	Float32 b;
	Float32 a;
};


#endif // _CPP_DATATYPE_H_
