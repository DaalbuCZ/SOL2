.class public final synthetic Lw3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lw3/v;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lw3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lw3/q;->a:Z

    iput-object p2, p0, Lw3/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lw3/q;->c:Lw3/v;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lw3/q;->a:Z

    iget-object v1, p0, Lw3/q;->b:Ljava/lang/String;

    iget-object v2, p0, Lw3/q;->c:Lw3/v;

    invoke-static {v0, v1, v2}, Lw3/z;->c(ZLjava/lang/String;Lw3/v;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
