function display(){
    var fname = document.getElementById("name1").value;
    var lname =  document.getElementById("name2").value;
    var cname =  document.getElementById("country").value;
    var gen = document.getElementById("gender").value;
    var prof= document.getElementById("profession").value;
    var email = document.getElementById("email").value;
    var mob = document.getElementById("mobno").value;

    if(fname===""||lname===""||cname===""||gen===""||prof===""||email===""||mob==="")
    window.alert("Provide all data ");
    else if(email.indexOf("@")==-1)
    window.alert("Email is not valid");
    else if(mob.length!=10)
    window.alert("Mobile number is not valid")
    else
    {
        
        window.alert("Name :" + fname+" "+lname +"\n" + "Country :" + cname + "\n" + "Gender :" + gen + "\n" + 
        "Profession :" + prof +"\n"+ "Email :"+ email +"\n"+ "Mobile :"+mob);
        document.getElementById("myform").reset();
        
    }
}

function clearAll(){
    document.getElementById("myform").reset();
}