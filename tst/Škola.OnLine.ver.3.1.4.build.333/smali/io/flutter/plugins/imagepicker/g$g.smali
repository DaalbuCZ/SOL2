.class Lio/flutter/plugins/imagepicker/g$g;
.super Lt8/r;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "g"
.end annotation


# static fields
.field public static final d:Lio/flutter/plugins/imagepicker/g$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/flutter/plugins/imagepicker/g$g;

    invoke-direct {v0}, Lio/flutter/plugins/imagepicker/g$g;-><init>()V

    sput-object v0, Lio/flutter/plugins/imagepicker/g$g;->d:Lio/flutter/plugins/imagepicker/g$g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lt8/r;-><init>()V

    return-void
.end method


# virtual methods
.method protected g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lt8/r;->g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p2}, Lt8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/g$m;->a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$m;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p2}, Lt8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/g$k;->a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$k;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p2}, Lt8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/g$h;->a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$h;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p2}, Lt8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/g$c;->a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$c;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p0, p2}, Lt8/r;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-static {p1}, Lio/flutter/plugins/imagepicker/g$b;->a(Ljava/util/ArrayList;)Lio/flutter/plugins/imagepicker/g$b;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p2, Lio/flutter/plugins/imagepicker/g$b;

    if-eqz v0, :cond_0

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/imagepicker/g$b;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$b;->d()Ljava/util/ArrayList;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/g$g;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/g$c;

    if-eqz v0, :cond_1

    const/16 v0, 0x81

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/imagepicker/g$c;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$c;->e()Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/g$h;

    if-eqz v0, :cond_2

    const/16 v0, 0x82

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/imagepicker/g$h;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$h;->h()Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_2
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/g$k;

    if-eqz v0, :cond_3

    const/16 v0, 0x83

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/imagepicker/g$k;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$k;->f()Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_3
    instance-of v0, p2, Lio/flutter/plugins/imagepicker/g$m;

    if-eqz v0, :cond_4

    const/16 v0, 0x84

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lio/flutter/plugins/imagepicker/g$m;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/g$m;->d()Ljava/util/ArrayList;

    move-result-object p2

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lio/flutter/plugins/imagepicker/g$g;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_4
    invoke-super {p0, p1, p2}, Lt8/r;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    throw p1
.end method
