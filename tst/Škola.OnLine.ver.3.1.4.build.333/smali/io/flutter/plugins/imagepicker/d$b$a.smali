.class Lio/flutter/plugins/imagepicker/d$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaScannerConnection$OnScanCompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/imagepicker/d$b;->b(Landroid/net/Uri;Lio/flutter/plugins/imagepicker/d$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugins/imagepicker/d$g;

.field final synthetic b:Lio/flutter/plugins/imagepicker/d$b;


# direct methods
.method constructor <init>(Lio/flutter/plugins/imagepicker/d$b;Lio/flutter/plugins/imagepicker/d$g;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/imagepicker/d$b$a;->b:Lio/flutter/plugins/imagepicker/d$b;

    iput-object p2, p0, Lio/flutter/plugins/imagepicker/d$b$a;->a:Lio/flutter/plugins/imagepicker/d$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 0

    iget-object p2, p0, Lio/flutter/plugins/imagepicker/d$b$a;->a:Lio/flutter/plugins/imagepicker/d$g;

    invoke-interface {p2, p1}, Lio/flutter/plugins/imagepicker/d$g;->a(Ljava/lang/String;)V

    return-void
.end method
