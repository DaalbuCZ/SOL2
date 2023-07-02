.class public final synthetic Ly1/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lx1/y2;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lx1/y2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/q0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/q0;->b:Lx1/y2;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ly1/q0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/q0;->b:Lx1/y2;

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, p1}, Ly1/o1;->A1(Ly1/c$a;Lx1/y2;Ly1/c;)V

    return-void
.end method
