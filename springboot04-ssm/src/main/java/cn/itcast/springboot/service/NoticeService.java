package cn.itcast.springboot.service;

import java.util.List;

import cn.itcast.springboot.pojo.Notice;

public interface NoticeService {
	List<Notice>findAll();
}
