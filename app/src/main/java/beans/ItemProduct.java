package beans;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class ItemProduct {
    private int image;
    private String title, store, location, phone, description;

    public ItemProduct(){
        this.image=0;
        this.title="";
        this.store="";
        this.location="";
        this.phone="";
        this.description="";
    }

    @Override
    public String toString() {
        return "Titulo: '" + this.title + "', Tienda: '" + this.store + "', Ubicación: '" + this.location
                + "', Telefono: '" + this.phone + "', Descripcon: '" + this.description+ "', Image: '" + this.image  + "'";
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getStore() {
        return store;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone() {
        return phone;
    }

    public String getDescription() {
        return description;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}  // fin de clase
