package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//商品id    
	//123
	private Integer id;
	//商品名称
	private String name;
	//商品数量
	private Integer number;
}
