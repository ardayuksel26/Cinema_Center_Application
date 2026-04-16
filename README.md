# Cinema Center Management System

Bu proje, bir sinema salonunun bilet satışı, film yönetimi, stok takibi ve personel organizasyonu gibi tüm operasyonel süreçlerini yönetmek için geliştirilmiş JavaFX tabanlı bir otomasyon sistemidir.

## Teknik Gereksinimler

Uygulamanın sorunsuz çalışabilmesi için sisteminizde aşağıdaki bileşenlerin kurulu olması gerekmektedir:

1. **Java Development Kit (JDK):** En az JDK 17 sürümü (JDK 23 veya 26 önerilir).
2. **MySQL Server:** Veritabanı işlemleri için sürüm 8.0 veya üzeri.
3. **Maven:** Bağımlılık yönetimi için (Proje dizininde Maven Wrapper -mvnw- mevcuttur).
4. **iText 7 Kütüphanesi:** PDF bilet ve makbuz üretimi için gereklidir (Maven tarafından otomatik yüklenir).

## Kullanıcı Rolleri ve Yetki Tanımları

Sistem, görev bazlı erişim kontrolü (RBAC) yapısına uygun olarak üç farklı yetki seviyesi sunar:

### 1. Kasiyer (Cashier)
* **Satış İşlemleri:** Vizyondaki filmlerin seçimi ve seans takibi.
* **Koltuk Yönetimi:** Salon A ve Salon B için interaktif koltuk seçimi ve anlık doluluk kontrolü.
* **Büfe Satışı:** Mısır, içecek ve diğer yan ürünlerin satışının bilet işlemine dahil edilmesi.
* **Belge Üretimi:** Satış tamamlandığında otomatik PDF bilet ve ödeme makbuzu oluşturma.

### 2. Müdür (Manager)
* **Envanter Kontrolü:** Büfe ürünlerinin stok miktarlarının izlenmesi ve güncellenmesi.
* **Personel Yönetimi:** Sisteme yeni çalışan tanımlama, mevcut personeli silme veya yetki bilgilerini düzenleme.
* **Finansal Raporlama:** Toplam hasılat, ödenen vergiler ve net kar oranlarının raporlanması.

### 3. Admin (Sistem Yöneticisi)
* **Film Portföy Yönetimi:** Yeni filmlerin sisteme eklenmesi, afiş, fiyat ve tür bilgilerinin güncellenmesi veya silinmesi.
* **Seans Planlama:** Filmlerin tarih, saat ve salon atamalarının yapılması.
* **İşlem İptali:** Satışı tamamlanmış işlemlerin iptal edilmesi. İptal işlemi, ilgili ürünlerin stoklarını ve genel hasılat verilerini otomatik olarak eski haline getirir.

## Kurulum ve Yapılandırma

### 1. Veritabanı Kurulumu
* MySQL üzerinde `cinema_center` adında bir veritabanı şeması oluşturun.
* `src/main/resources/com/Database/Group15.sql` dosyasını oluşturduğunuz bu şemaya içeri aktarın (Import).

### 2. Veritabanı Bağlantı Ayarları
`src/main/java/com/group15/Facade.java` dosyasını açarak aşağıdaki değişkenleri kendi MySQL bilgilerinizle güncelleyin:
* `DB_USER`: Veritabanı kullanıcı adınız.
* `DB_PASSWORD`: Veritabanı şifreniz.

### 3. Uygulamayı Başlatma
Terminal veya komut satırı üzerinden projenin ana dizinine giderek aşağıdaki komutu çalıştırın:
```powershell
./mvnw clean javafx:run
```

## Varsayılan Giriş Bilgileri

| Rol | Kullanıcı Adı | Şifre |
| :--- | :--- | :--- |
| **Admin** | admin1 | admin1 |
| **Müdür** | manager1 | manager1 |
| **Kasiyer** | cashier1 | cashier1 |

---

## Uygulama Görselleri / Application Screenshots

### Giriş Ekranı / Login Screen
(Buraya Giriş Ekranı fotoğrafını yerleştiriniz)

---

### Admin Menüsü / Admin Menu
(Buraya Admin Menüsü fotoğrafını yerleştiriniz)

---

### Film Yönetim Ekranı / Movie Management Screen
(Buraya Film Yönetim Ekranı fotoğrafını yerleştiriniz)

---

### Aylık Seans Planlama Ekranı / Monthly Schedule Screen
(Buraya Aylık Seans Planlama Ekranı fotoğrafını yerleştiriniz)

---

### Kasiyer Menüsü / Cashier Menu
(Buraya Kasiyer Menüsü fotoğrafını yerleştiriniz)

---

### Çalışan Yönetim Ekranı / Employee Screen
(Buraya Çalışan Yönetim Ekranı fotoğrafını yerleştiriniz)

---

### Bilet Fiyatlandırma Menüsü / Ticket Price Menu
(Buraya Bilet Fiyatlandırma Menüsü fotoğrafını yerleştiriniz)

---

### Hasılat Raporu Menüsü / Revenue Report Menu
(Buraya Hasılat Raporu Menüsü fotoğrafını yerleştiriniz)

---

© 2025 Group 15 Cinema Center Management System
