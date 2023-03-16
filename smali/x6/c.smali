.class public Lx6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lorg/apache/http/client/ResponseHandler;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lorg/apache/http/client/ResponseHandler<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lorg/apache/http/client/ResponseHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;"
        }
    .end annotation
.end field

.field private final b:La7/l;

.field private final c:Lv6/h;


# direct methods
.method public constructor <init>(Lorg/apache/http/client/ResponseHandler;La7/l;Lv6/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "La7/l;",
            "Lv6/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/c;->a:Lorg/apache/http/client/ResponseHandler;

    iput-object p2, p0, Lx6/c;->b:La7/l;

    iput-object p3, p0, Lx6/c;->c:Lv6/h;

    return-void
.end method


# virtual methods
.method public handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/http/HttpResponse;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lx6/c;->c:Lv6/h;

    iget-object v1, p0, Lx6/c;->b:La7/l;

    invoke-virtual {v1}, La7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv6/h;->x(J)Lv6/h;

    iget-object v0, p0, Lx6/c;->c:Lv6/h;

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/h;->p(I)Lv6/h;

    invoke-static {p1}, Lx6/e;->a(Lorg/apache/http/HttpMessage;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lx6/c;->c:Lv6/h;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lv6/h;->v(J)Lv6/h;

    :cond_0
    invoke-static {p1}, Lx6/e;->b(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lx6/c;->c:Lv6/h;

    invoke-virtual {v1, v0}, Lv6/h;->u(Ljava/lang/String;)Lv6/h;

    :cond_1
    iget-object v0, p0, Lx6/c;->c:Lv6/h;

    invoke-virtual {v0}, Lv6/h;->b()Lb7/h;

    iget-object v0, p0, Lx6/c;->a:Lorg/apache/http/client/ResponseHandler;

    invoke-interface {v0, p1}, Lorg/apache/http/client/ResponseHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
