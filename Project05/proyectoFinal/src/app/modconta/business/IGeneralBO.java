package app.modconta.business;

import java.util.List;

public interface IGeneralBO<T> {
    void Create(T param);
    
    void Update(T param);
    
    void Delete(int id);
    
    T Find(int code);
    
    List<T> readAll();
    
 
}
