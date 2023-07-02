.class public final synthetic Ly1/z0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu3/q$a;


# instance fields
.field public final synthetic a:Ly1/c$a;

.field public final synthetic b:Lz2/n;

.field public final synthetic c:Lz2/q;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Ly1/c$a;Lz2/n;Lz2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/z0;->a:Ly1/c$a;

    iput-object p2, p0, Ly1/z0;->b:Lz2/n;

    iput-object p3, p0, Ly1/z0;->c:Lz2/q;

    iput-object p4, p0, Ly1/z0;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Ly1/z0;->e:Z

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Ly1/z0;->a:Ly1/c$a;

    iget-object v1, p0, Ly1/z0;->b:Lz2/n;

    iget-object v2, p0, Ly1/z0;->c:Lz2/q;

    iget-object v3, p0, Ly1/z0;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Ly1/z0;->e:Z

    move-object v5, p1

    check-cast v5, Ly1/c;

    invoke-static/range {v0 .. v5}, Ly1/o1;->W0(Ly1/c$a;Lz2/n;Lz2/q;Ljava/io/IOException;ZLy1/c;)V

    return-void
.end method
