function reverseString(str)
{
    let ans="";
    const arr= str.split(" ");
    for(let i=0;i<arr.length;i++)
    {
        const rev = arr[i].split("").reverse().join("");
        ans+=rev+" ";
    }
    ans=ans.substring(0,ans.length-1);
    console.log(ans);
}

const s="This is a sunny day";
reverseString(s);