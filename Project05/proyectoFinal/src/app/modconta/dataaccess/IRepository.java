package app.modconta.dataaccess;

import java.util.List;

public interface IRepository<T> {

    void Create(T param);
    
    void Update(T param);
    
    void Delete(int id);
    
    T Find(int code);
    
    List<T> readAll();
}
