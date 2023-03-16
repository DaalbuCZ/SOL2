.class Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->a(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ljava/lang/Object;

.field final synthetic o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;


# direct methods
.method constructor <init>(Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b$a;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b$a;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b$a;->o:Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;

    invoke-static {v0}, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;->d(Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b;)Ll8/k$d;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/imagepicker/ImagePickerPlugin$b$a;->n:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ll8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method
