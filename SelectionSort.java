public void selectionSort()
{
int out, in, min;
	for(out=0; out<nElems-1; out++) // outer loop
	{
		min = out; // minimum
		for(in=out+1; in<nElems; in++) // inner loop
			if(a[in] < a[min] ) // if min greater,
				min = in; // we have a new min
				swap(out, min); // swap them
	} // end for(out)
} // end selectionSort()