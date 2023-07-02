.class Lm0/b$c;
.super Landroid/webkit/WebView$VisualStateCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm0/b;->i(Landroid/webkit/WebView;JLl0/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll0/f;


# direct methods
.method constructor <init>(Ll0/f;)V
    .locals 0

    iput-object p1, p0, Lm0/b$c;->a:Ll0/f;

    invoke-direct {p0}, Landroid/webkit/WebView$VisualStateCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(J)V
    .locals 1

    iget-object v0, p0, Lm0/b$c;->a:Ll0/f;

    invoke-interface {v0, p1, p2}, Ll0/f;->onComplete(J)V

    return-void
.end method
