package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//��Ʒid  
	private Integer id;
	//��Ʒ����
	private String name;
	//��Ʒ����1
	private Integer number;
}
