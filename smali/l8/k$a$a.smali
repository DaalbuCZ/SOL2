.class Ll8/k$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll8/k$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll8/k$a;->a(Ljava/nio/ByteBuffer;Ll8/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll8/c$b;

.field final synthetic b:Ll8/k$a;


# direct methods
.method constructor <init>(Ll8/k$a;Ll8/c$b;)V
    .locals 0

    iput-object p1, p0, Ll8/k$a$a;->b:Ll8/k$a;

    iput-object p2, p0, Ll8/k$a$a;->a:Ll8/c$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll8/k$a$a;->a:Ll8/c$b;

    iget-object v1, p0, Ll8/k$a$a;->b:Ll8/k$a;

    iget-object v1, v1, Ll8/k$a;->b:Ll8/k;

    invoke-static {v1}, Ll8/k;->a(Ll8/k;)Ll8/l;

    move-result-object v1

    invoke-interface {v1, p1}, Ll8/l;->b(Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Ll8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll8/k$a$a;->a:Ll8/c$b;

    iget-object v1, p0, Ll8/k$a$a;->b:Ll8/k$a;

    iget-object v1, v1, Ll8/k$a;->b:Ll8/k;

    invoke-static {v1}, Ll8/k;->a(Ll8/k;)Ll8/l;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3}, Ll8/l;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0, p1}, Ll8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Ll8/k$a$a;->a:Ll8/c$b;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ll8/c$b;->a(Ljava/nio/ByteBuffer;)V

    return-void
.end method
