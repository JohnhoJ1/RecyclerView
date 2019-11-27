package com.jon.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context mContext;
    List<Contacts> contactsList;
    public ContactsAdapter(Context mContext, List<Contacts> contactsList){
        this.mContext = mContext;
        this.contactsList = contactsList;
    }
    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contacts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.imageView.setImageResource(contacts.getImageId());
        holder.textView.setText(contacts.getName());
        holder.textView1.setText(contacts.getAddress());
        holder.textView2.setText(contacts.getPhoneNo());
        holder.textView2.setText(contacts.getGender());
        holder.imageView2.setImageResource(contacts.getImgdelete());


    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        TextView textView, textView1,textView2,textView3;
        ImageView imageView, imageView2;
        public ContactsViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.tvName);
            textView1 = itemView.findViewById(R.id.tvAddress);
            textView2 = itemView.findViewById(R.id.tvPhn);
            textView3 = itemView.findViewById(R.id.tvGender);
            imageView2 = itemView.findViewById(R.id.btn_delete);

        }
    }
}
