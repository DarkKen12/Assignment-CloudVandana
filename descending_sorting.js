
function quickSort(arr,low,high)
{
    if(low<high)
    {
        let pIndex = partition(arr,low,high);
        quickSort(arr,low,pIndex-1);
        quickSort(arr,pIndex+1,high);
    }

}


function partition(arr,low,high)
{
    let pivot = arr[low];
    let i=low;
    let j=high;
    while(i<j)
    {   
        while(arr[i]>=pivot && i<high) 
            i++;
        while(arr[j]<pivot && j>low)
            j--;
        if(i<j)
        {
            let temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
    }
    let x=arr[low];
    arr[low]=arr[j];
    arr[j]=x;
    return j;
}

let arr=[12,43,56,23,356,2];
quickSort(arr,0,arr.length-1)
console.log(arr);