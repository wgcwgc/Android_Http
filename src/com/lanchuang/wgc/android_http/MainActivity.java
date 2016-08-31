package com.lanchuang.wgc.android_http;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * 
 * 有几个技能你先掌握下： 1.
 * 采用HTTP与服务器通信，方法采用GET/POST，提交参数要做url encode，提交的数据和返回的数据采用JSON格式，要学会组织和解析 2.
 * 采用Web View方式打开HTML5的网页，能正确显示网页内容，提供按钮返回上一页和直接关闭，就像微信内嵌入的网页一样 3.
 * 掌握播放本地音频文件、服务器音频流的操作方法（播放、停止、快进、拖动），掌握通过麦克风录音并存储文件的方法，掌握文件上传服务器的方法。
 * 
 * @author Administrator
 * 
 */
public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState )
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu )
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main ,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item )
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if(id == R.id.action_settings)
		{
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
