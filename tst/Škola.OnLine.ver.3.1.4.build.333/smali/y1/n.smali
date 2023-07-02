.class public final synthetic Ly1/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/n;->a:Ly1/c$a;

    iput p2, p0, Ly1/n;->b:I

    iput-boolean p3, p0, Ly1/n;->c:Z

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly1/n;->a:Ly1/c$a;

    iget v1, p0, Ly1/n;->b:I

    iget-boolean v2, p0, Ly1/n;->c:Z

    check-cast p1, Ly1/c;

    invoke-static {v0, v1, v2, p1}, Ly1/o1;->r0(Ly1/c$a;IZLy1/c;)V

    return-void
.end method
