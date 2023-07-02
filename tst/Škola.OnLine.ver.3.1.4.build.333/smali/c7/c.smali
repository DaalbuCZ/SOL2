.class public Lc7/c;
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

.field private final b:Lf7/l;

.field private final c:La7/h;


# direct methods
.method public constructor <init>(Lorg/apache/http/client/ResponseHandler;Lf7/l;La7/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/http/client/ResponseHandler<",
            "+TT;>;",
            "Lf7/l;",
            "La7/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/c;->a:Lorg/apache/http/client/ResponseHandler;

    iput-object p2, p0, Lc7/c;->b:Lf7/l;

    iput-object p3, p0, Lc7/c;->c:La7/h;

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

    iget-object v0, p0, Lc7/c;->c:La7/h;

    iget-object v1, p0, Lc7/c;->b:Lf7/l;

    invoke-virtual {v1}, Lf7/l;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, La7/h;->x(J)La7/h;

    iget-object v0, p0, Lc7/c;->c:La7/h;

    invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v1

    invoke-virtual {v0, v1}, La7/h;->p(I)La7/h;

    invoke-static {p1}, Lc7/e;->a(Lorg/apache/http/HttpMessage;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc7/c;->c:La7/h;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, La7/h;->v(J)La7/h;

    :cond_0
    invoke-static {p1}, Lc7/e;->b(Lorg/apache/http/HttpResponse;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lc7/c;->c:La7/h;

    invoke-virtual {v1, v0}, La7/h;->u(Ljava/lang/String;)La7/h;

    :cond_1
    iget-object v0, p0, Lc7/c;->c:La7/h;

    invoke-virtual {v0}, La7/h;->b()Lg7/h;

    iget-object v0, p0, Lc7/c;->a:Lorg/apache/http/client/ResponseHandler;

    invoke-interface {v0, p1}, Lorg/apache/http/client/ResponseHandler;->handleResponse(Lorg/apache/http/HttpResponse;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
