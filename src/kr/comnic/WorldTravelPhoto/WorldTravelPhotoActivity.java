package kr.comnic.WorldTravelPhoto;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class WorldTravelPhotoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Gallery g = (Gallery)findViewById(R.id.gallery1);
        g.setAdapter(new ImageAdapter2(this));
    }
}

class ImageAdapter2 extends BaseAdapter {
	private Context m_context;
	private int[] m_imageIds = {
			R.drawable.i001,
			R.drawable.i002,
			R.drawable.i003,
			R.drawable.i004,
			R.drawable.i005,
			R.drawable.i006,
			R.drawable.i007,
			R.drawable.i008,
			R.drawable.i009,
			R.drawable.i010,
			R.drawable.i011,			
	};
	
	public ImageAdapter2(Context c){
		m_context = c;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return m_imageIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return m_imageIds[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView;
		
		if(convertView == null){
			imageView = new ImageView(m_context);
		}else{
			imageView = (ImageView)convertView;
		}
		
		imageView.setImageResource(m_imageIds[position]);
		//imageView.setScaleType(ImageView.ScaleType.FIT_XY);
		//imageView.setLayoutParams(new Gallery.LayoutParams(136, 88));
		
		return imageView;
	}
	
}