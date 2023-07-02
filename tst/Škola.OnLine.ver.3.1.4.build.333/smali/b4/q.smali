.class public final synthetic Lb4/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lb4/v;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lb4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb4/q;->a:Z

    iput-object p2, p0, Lb4/q;->b:Ljava/lang/String;

    iput-object p3, p0, Lb4/q;->c:Lb4/v;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lb4/q;->a:Z

    iget-object v1, p0, Lb4/q;->b:Ljava/lang/String;

    iget-object v2, p0, Lb4/q;->c:Lb4/v;

    invoke-static {v0, v1, v2}, Lb4/z;->c(ZLjava/lang/String;Lb4/v;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
