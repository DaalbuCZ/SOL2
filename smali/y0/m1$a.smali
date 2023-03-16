.class Ly0/m1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/c1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/m1;->a(Lz0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/c;

.field final synthetic b:Ly0/m1;


# direct methods
.method constructor <init>(Ly0/m1;Lz0/c;)V
    .locals 0

    iput-object p1, p0, Ly0/m1$a;->b:Ly0/m1;

    iput-object p2, p0, Ly0/m1$a;->a:Lz0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ly0/m1$a;->b:Ly0/m1;

    invoke-static {v0}, Ly0/m1;->b(Ly0/m1;)I

    move-result v0

    invoke-static {p1, v0}, Ly0/f0;->a(Ljava/lang/String;I)Ly0/f0;

    move-result-object p1

    invoke-virtual {p1}, Ly0/f0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ly0/m1$a;->b:Ly0/m1;

    iget-object v1, p0, Ly0/m1$a;->a:Lz0/c;

    invoke-static {v0, p1, v1}, Ly0/m1;->e(Ly0/m1;Ly0/f0;Lz0/c;)V
    :try_end_0
    .catch Ly0/u2; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
