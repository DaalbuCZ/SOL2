.class public Lio/flutter/plugins/imagepicker/ImagePickerPlugin;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$c;
.implements Lc8/a;
.implements Ld8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;,
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;,
        Lio/flutter/plugins/imagepicker/ImagePickerPlugin$LifeCycleObserver;
    }
.end annotation


# instance fields
.field private n:Lc8/a$b;

.field private o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;)Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;
    .locals 0

    iget-object p0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    return-object p0
.end method

.method private c(Ll8/c;Landroid/app/Application;Landroid/app/Activity;Ll8/o;Ld8/c;)V
    .locals 9

    new-instance v8, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p1

    move-object v5, p0

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;-><init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin;Landroid/app/Application;Landroid/app/Activity;Ll8/c;Ll8/k$c;Ll8/o;Ld8/c;)V

    iput-object v8, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    return-void
.end method

.method private d()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    :cond_0
    return-void
.end method


# virtual methods
.method final b(Landroid/app/Activity;)Lio/flutter/plugins/imagepicker/e;
    .locals 4

    new-instance v0, Lio/flutter/plugins/imagepicker/d;

    invoke-direct {v0, p1}, Lio/flutter/plugins/imagepicker/d;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getCacheDir()Ljava/io/File;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/imagepicker/b;

    invoke-direct {v2}, Lio/flutter/plugins/imagepicker/b;-><init>()V

    new-instance v3, Lio/flutter/plugins/imagepicker/g;

    invoke-direct {v3, v1, v2}, Lio/flutter/plugins/imagepicker/g;-><init>(Ljava/io/File;Lio/flutter/plugins/imagepicker/b;)V

    new-instance v2, Lio/flutter/plugins/imagepicker/e;

    invoke-direct {v2, p1, v1, v3, v0}, Lio/flutter/plugins/imagepicker/e;-><init>(Landroid/app/Activity;Ljava/io/File;Lio/flutter/plugins/imagepicker/g;Lio/flutter/plugins/imagepicker/d;)V

    return-object v2
.end method

.method public onAttachedToActivity(Ld8/c;)V
    .locals 7

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->n:Lc8/a$b;

    invoke-virtual {v0}, Lc8/a$b;->b()Ll8/c;

    move-result-object v2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->n:Lc8/a$b;

    invoke-virtual {v0}, Lc8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/app/Application;

    invoke-interface {p1}, Ld8/c;->e()Landroid/app/Activity;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p0

    move-object v6, p1

    invoke-direct/range {v1 .. v6}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->c(Ll8/c;Landroid/app/Application;Landroid/app/Activity;Ll8/o;Ld8/c;)V

    return-void
.end method

.method public onAttachedToEngine(Lc8/a$b;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->n:Lc8/a$b;

    return-void
.end method

.method public onDetachedFromActivity()V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->d()V

    return-void
.end method

.method public onDetachedFromActivityForConfigChanges()V
    .locals 0

    invoke-virtual {p0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->onDetachedFromActivity()V

    return-void
.end method

.method public onDetachedFromEngine(Lc8/a$b;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->n:Lc8/a$b;

    return-void
.end method

.method public onMethodCall(Ll8/j;Ll8/k$d;)V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    invoke-direct {v0, p2}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;-><init>(Ll8/k$d;)V

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;

    invoke-virtual {p2}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$a;->b()Lio/flutter/plugins/imagepicker/e;

    move-result-object p2

    const-string v1, "cameraDevice"

    invoke-virtual {p1, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-virtual {p1, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_1

    sget-object v1, Lio/flutter/plugins/imagepicker/a;->o:Lio/flutter/plugins/imagepicker/a;

    goto :goto_0

    :cond_1
    sget-object v1, Lio/flutter/plugins/imagepicker/a;->n:Lio/flutter/plugins/imagepicker/a;

    :goto_0
    invoke-virtual {p2, v1}, Lio/flutter/plugins/imagepicker/e;->G(Lio/flutter/plugins/imagepicker/a;)V

    :cond_2
    iget-object v1, p1, Ll8/j;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "retrieve"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_1
    const-string v4, "pickVideo"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_2
    const-string v4, "pickImage"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    move v2, v3

    goto :goto_1

    :sswitch_3
    const-string v4, "pickMultiImage"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    :goto_1
    const-string v1, "source"

    packed-switch v2, :pswitch_data_0

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown method "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ll8/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    invoke-virtual {p2, v0}, Lio/flutter/plugins/imagepicker/e;->E(Ll8/k$d;)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {p1, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_8

    if-ne v1, v3, :cond_7

    invoke-virtual {p2, p1, v0}, Lio/flutter/plugins/imagepicker/e;->f(Ll8/j;Ll8/k$d;)V

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid video source: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {p2, p1, v0}, Lio/flutter/plugins/imagepicker/e;->J(Ll8/j;Ll8/k$d;)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {p1, v1}, Ll8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_a

    if-ne v1, v3, :cond_9

    invoke-virtual {p2, p1, v0}, Lio/flutter/plugins/imagepicker/e;->d(Ll8/j;Ll8/k$d;)V

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid image source: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p2, p1, v0}, Lio/flutter/plugins/imagepicker/e;->I(Ll8/j;Ll8/k$d;)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {p2, p1, v0}, Lio/flutter/plugins/imagepicker/e;->e(Ll8/j;Ll8/k$d;)V

    :goto_2
    return-void

    :cond_b
    :goto_3
    const/4 p1, 0x0

    const-string v0, "no_activity"

    const-string v1, "image_picker plugin requires a foreground activity."

    invoke-interface {p2, v0, v1, p1}, Ll8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x65dc595d -> :sswitch_3
        -0x56dcda46 -> :sswitch_2
        -0x56276f26 -> :sswitch_1
        -0x127abfc4 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReattachedToActivityForConfigChanges(Ld8/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin;->onAttachedToActivity(Ld8/c;)V

    return-void
.end method
