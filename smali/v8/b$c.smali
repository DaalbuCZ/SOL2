.class Lv8/b$c;
.super Ll8/r;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# static fields
.field public static final d:Lv8/b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv8/b$c;

    invoke-direct {v0}, Lv8/b$c;-><init>()V

    sput-object v0, Lv8/b$c;->d:Lv8/b$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ll8/r;-><init>()V

    return-void
.end method


# virtual methods
.method protected g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Ll8/r;->g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$j;->a(Ljava/util/Map;)Lv8/b$j;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$i;->a(Ljava/util/Map;)Lv8/b$i;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$h;->a(Ljava/util/Map;)Lv8/b$h;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$g;->a(Ljava/util/Map;)Lv8/b$g;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$f;->a(Ljava/util/Map;)Lv8/b$f;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$e;->a(Ljava/util/Map;)Lv8/b$e;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p0, p2}, Ll8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lv8/b$d;->a(Ljava/util/Map;)Lv8/b$d;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lv8/b$d;

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$d;

    invoke-virtual {p2}, Lv8/b$d;->l()Ljava/util/Map;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Lv8/b$c;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lv8/b$e;

    if-eqz v0, :cond_1

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$e;

    invoke-virtual {p2}, Lv8/b$e;->f()Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lv8/b$f;

    if-eqz v0, :cond_2

    const/16 v0, 0x82

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$f;

    invoke-virtual {p2}, Lv8/b$f;->d()Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lv8/b$g;

    if-eqz v0, :cond_3

    const/16 v0, 0x83

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$g;

    invoke-virtual {p2}, Lv8/b$g;->f()Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_3
    instance-of v0, p2, Lv8/b$h;

    if-eqz v0, :cond_4

    const/16 v0, 0x84

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$h;

    invoke-virtual {p2}, Lv8/b$h;->f()Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_4
    instance-of v0, p2, Lv8/b$i;

    if-eqz v0, :cond_5

    const/16 v0, 0x85

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$i;

    invoke-virtual {p2}, Lv8/b$i;->d()Ljava/util/Map;

    move-result-object p2

    goto :goto_0

    :cond_5
    instance-of v0, p2, Lv8/b$j;

    if-eqz v0, :cond_6

    const/16 v0, 0x86

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lv8/b$j;

    invoke-virtual {p2}, Lv8/b$j;->f()Ljava/util/Map;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lv8/b$c;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_6
    invoke-super {p0, p1, p2}, Ll8/r;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method
