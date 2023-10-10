function display(val){
    document.getElementById('text-input').value+=val;

}

function calculate(){
    var t=document.getElementById('text-input').value;
    var ans = eval(t);
    document.getElementById('text-input').value=ans;
}

function clearInput(){
    document.getElementById('text-input').value = " ";
}