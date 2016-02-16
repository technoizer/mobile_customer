package id.ac.its.alpro.customer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.net.ContentHandler;
import java.util.List;

/**
 * Created by Luffi on 16/02/2016.
 */
public class List_adapter extends ArrayAdapter<String> {

    private List<String> items;
    private int layoutResourceId;
    private Context context;


    public List_adapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.layoutResourceId = resource;
        this.context = context;
        this.items = objects;
    }



    @Override
    public View getView(int position, View view, ViewGroup parent){
        Data_item data = new Data_item();

        LayoutInflater inflater = ((Activity)context).getLayoutInflater();
        View row = inflater.inflate(layoutResourceId,parent,false);

        data.Jenis = (TextView)row.findViewById(R.id.jenis);
        data.status=(TextView)row.findViewById(R.id.status);
        data.tanggal=(TextView)row.findViewById(R.id.tanggal);

        return row;

    }

    public static class Data_item {
        TextView tanggal;
        TextView Jenis;
        TextView status;
    }
}
