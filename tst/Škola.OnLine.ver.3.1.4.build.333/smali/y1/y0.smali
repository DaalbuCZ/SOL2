.class public final synthetic Ly1/y0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lz2/n;

.field public final synthetic c:Lz2/q;


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/y0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/y0;->b:Lz2/n;

    iput-object p3, p0, Ly1/y0;->c:Lz2/q;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly1/y0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/y0;->b:Lz2/n;

    iget-object v2, p0, Ly1/y0;->c:Lz2/q;

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, p1}, Ly1/o1;->m1(Ly1/c$a;Lz2/n;Lz2/q;Ly1/c;)V

    return-void
.end method
