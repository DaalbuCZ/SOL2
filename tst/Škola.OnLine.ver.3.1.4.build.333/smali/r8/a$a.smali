.class Lr8/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr8/a;


# direct methods
.method constructor <init>(Lr8/a;)V
    .locals 0

    iput-object p1, p0, Lr8/a$a;->a:Lr8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Lr8/a$a;->a:Lr8/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lr8/a;->b(Lr8/a;Z)Z

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lr8/a$a;->a:Lr8/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lr8/a;->b(Lr8/a;Z)Z

    return-void
.end method
