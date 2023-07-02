.class Lm0/b$b;
.super Landroid/webkit/WebMessagePort$WebMessageCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/b;->m(Landroid/webkit/WebMessagePort;Ll0/d$a;Landroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Ll0/d$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/webkit/WebMessagePort$WebMessageCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onMessage(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V
    .locals 1

    new-instance v0, Lm0/h;

    invoke-direct {v0, p1}, Lm0/h;-><init>(Landroid/webkit/WebMessagePort;)V

    invoke-static {p2}, Lm0/h;->c(Landroid/webkit/WebMessage;)Ll0/c;

    const/4 p1, 0x0

    throw p1
.end method
