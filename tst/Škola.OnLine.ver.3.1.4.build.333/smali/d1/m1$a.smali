.class Ld1/m1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld1/c1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/m1;->a(Le1/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Le1/c;

.field final synthetic b:Ld1/m1;


# direct methods
.method constructor <init>(Ld1/m1;Le1/c;)V
    .locals 0

    iput-object p1, p0, Ld1/m1$a;->b:Ld1/m1;

    iput-object p2, p0, Ld1/m1$a;->a:Le1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ld1/m1$a;->b:Ld1/m1;

    invoke-static {v0}, Ld1/m1;->b(Ld1/m1;)I

    move-result v0

    invoke-static {p1, v0}, Ld1/f0;->a(Ljava/lang/String;I)Ld1/f0;

    move-result-object p1

    invoke-virtual {p1}, Ld1/f0;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld1/m1$a;->b:Ld1/m1;

    iget-object v1, p0, Ld1/m1$a;->a:Le1/c;

    invoke-static {v0, p1, v1}, Ld1/m1;->e(Ld1/m1;Ld1/f0;Le1/c;)V
    :try_end_0
    .catch Ld1/u2; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
