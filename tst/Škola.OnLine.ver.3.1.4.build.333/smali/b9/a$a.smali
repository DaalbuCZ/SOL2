.class Lb9/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb9/a;->b(Landroid/content/SharedPreferences$Editor;Lt8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Landroid/content/SharedPreferences$Editor;

.field final synthetic o:Lt8/k$d;

.field final synthetic p:Lb9/a;


# direct methods
.method constructor <init>(Lb9/a;Landroid/content/SharedPreferences$Editor;Lt8/k$d;)V
    .locals 0

    iput-object p1, p0, Lb9/a$a;->p:Lb9/a;

    iput-object p2, p0, Lb9/a$a;->n:Landroid/content/SharedPreferences$Editor;

    iput-object p3, p0, Lb9/a$a;->o:Lt8/k$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lb9/a$a;->n:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    iget-object v1, p0, Lb9/a$a;->p:Lb9/a;

    invoke-static {v1}, Lb9/a;->a(Lb9/a;)Landroid/os/Handler;

    move-result-object v1

    new-instance v2, Lb9/a$a$a;

    invoke-direct {v2, p0, v0}, Lb9/a$a$a;-><init>(Lb9/a$a;Z)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
