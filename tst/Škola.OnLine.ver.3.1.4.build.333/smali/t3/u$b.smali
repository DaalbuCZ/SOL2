.class public final Lt3/u$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt3/l$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Lt3/d0;

.field private b:Lt3/p0;

.field private c:Lf5/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf5/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt3/d0;

    invoke-direct {v0}, Lt3/d0;-><init>()V

    iput-object v0, p0, Lt3/u$b;->a:Lt3/d0;

    const/16 v0, 0x1f40

    iput v0, p0, Lt3/u$b;->e:I

    iput v0, p0, Lt3/u$b;->f:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lt3/l;
    .locals 1

    invoke-virtual {p0}, Lt3/u$b;->b()Lt3/u;

    move-result-object v0

    return-object v0
.end method

.method public b()Lt3/u;
    .locals 10

    new-instance v9, Lt3/u;

    iget-object v1, p0, Lt3/u$b;->d:Ljava/lang/String;

    iget v2, p0, Lt3/u$b;->e:I

    iget v3, p0, Lt3/u$b;->f:I

    iget-boolean v4, p0, Lt3/u$b;->g:Z

    iget-object v5, p0, Lt3/u$b;->a:Lt3/d0;

    iget-object v6, p0, Lt3/u$b;->c:Lf5/l;

    iget-boolean v7, p0, Lt3/u$b;->h:Z

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lt3/u;-><init>(Ljava/lang/String;IIZLt3/d0;Lf5/l;ZLt3/u$a;)V

    iget-object v0, p0, Lt3/u$b;->b:Lt3/p0;

    if-eqz v0, :cond_0

    invoke-virtual {v9, v0}, Lt3/g;->c(Lt3/p0;)V

    :cond_0
    return-object v9
.end method

.method public c(Z)Lt3/u$b;
    .locals 0

    iput-boolean p1, p0, Lt3/u$b;->g:Z

    return-object p0
.end method

.method public final d(Ljava/util/Map;)Lt3/u$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lt3/u$b;"
        }
    .end annotation

    iget-object v0, p0, Lt3/u$b;->a:Lt3/d0;

    invoke-virtual {v0, p1}, Lt3/d0;->a(Ljava/util/Map;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lt3/u$b;
    .locals 0

    iput-object p1, p0, Lt3/u$b;->d:Ljava/lang/String;

    return-object p0
.end method
