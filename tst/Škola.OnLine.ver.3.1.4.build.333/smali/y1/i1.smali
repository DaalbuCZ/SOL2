.class public final synthetic Ly1/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$b;


# instance fields
.field public final synthetic a:Ly1/o1;

.field public final synthetic b:Lx1/c3;


# direct methods
.method public synthetic constructor <init>(Ly1/o1;Lx1/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/i1;->a:Ly1/o1;

    iput-object p2, p0, Ly1/i1;->b:Lx1/c3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lu3/l;)V
    .locals 2

    iget-object v0, p0, Ly1/i1;->a:Ly1/o1;

    iget-object v1, p0, Ly1/i1;->b:Lx1/c3;

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, p1, p2}, Ly1/o1;->q1(Ly1/o1;Lx1/c3;Ly1/c;Lu3/l;)V

    return-void
.end method
