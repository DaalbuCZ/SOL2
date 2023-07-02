.class Lg8/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg8/a;


# direct methods
.method constructor <init>(Lg8/a;)V
    .locals 0

    iput-object p1, p0, Lg8/a$a;->a:Lg8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;Lt8/c$b;)V
    .locals 1

    iget-object p2, p0, Lg8/a$a;->a:Lg8/a;

    sget-object v0, Lt8/t;->b:Lt8/t;

    invoke-virtual {v0, p1}, Lt8/t;->c(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lg8/a;->h(Lg8/a;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lg8/a$a;->a:Lg8/a;

    invoke-static {p1}, Lg8/a;->i(Lg8/a;)Lg8/a$e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg8/a$a;->a:Lg8/a;

    invoke-static {p1}, Lg8/a;->i(Lg8/a;)Lg8/a$e;

    move-result-object p1

    iget-object p2, p0, Lg8/a$a;->a:Lg8/a;

    invoke-static {p2}, Lg8/a;->g(Lg8/a;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lg8/a$e;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
