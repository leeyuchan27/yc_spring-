/**
 * 
 */
let inputType=[];
let inputName=[];
$(function(){
	
	$("#del").on("click",function(){
		var bookId=$(this).data("id");
		var isOk=confirm("정말로 삭제하시겠습니까?");
		if(isOk){
			location.href="/book/delete?id="+bookId;	
		}
	});

	
	$("#modify").on("click",function(){
		$.each($(".value"),function(i,v){
			var text=$(v).text(),trim();
			if(inputType[i]=="number"){
				text=text.replace(/[^0-9]/g,"");
				if(isNaN(text))text=text.substring(1);
			}
			v.html("<input type='' name='' value='"+text+"'>");
		});
		
		$(this).attr("id","");
		$(this).attr("type","submit");
		var url=$("#fm").attr("action");
		url=url.substring(0,url.lastIndexOf("/"))+"/update";
		$("#fm").attr("action",url);
		
		$("#mod").on("click",function(){$("#fm").submit();});
	});	
	
	
});