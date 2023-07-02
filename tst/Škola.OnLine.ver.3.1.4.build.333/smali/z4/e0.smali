.class final Lz4/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz4/e;


# instance fields
.field private final a:Lz4/e0;

.field private final b:La5/g;

.field private final c:La5/g;

.field private final d:La5/g;

.field private final e:La5/g;

.field private final f:La5/g;

.field private final g:La5/g;


# direct methods
.method synthetic constructor <init>(Lz4/n;Lz4/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lz4/e0;->a:Lz4/e0;

    new-instance p2, Lz4/p;

    invoke-direct {p2, p1}, Lz4/p;-><init>(Lz4/n;)V

    iput-object p2, p0, Lz4/e0;->b:La5/g;

    new-instance p1, Lz4/z;

    invoke-direct {p1, p2}, Lz4/z;-><init>(La5/g;)V

    invoke-static {p1}, La5/e;->b(La5/g;)La5/g;

    move-result-object p1

    iput-object p1, p0, Lz4/e0;->c:La5/g;

    new-instance v0, Lz4/x;

    invoke-direct {v0, p2, p1}, Lz4/x;-><init>(La5/g;La5/g;)V

    invoke-static {v0}, La5/e;->b(La5/g;)La5/g;

    move-result-object p1

    iput-object p1, p0, Lz4/e0;->d:La5/g;

    new-instance v0, Lz4/j;

    invoke-direct {v0, p2}, Lz4/j;-><init>(La5/g;)V

    invoke-static {v0}, La5/e;->b(La5/g;)La5/g;

    move-result-object v0

    iput-object v0, p0, Lz4/e0;->e:La5/g;

    new-instance v1, Lz4/m;

    invoke-direct {v1, p1, v0, p2}, Lz4/m;-><init>(La5/g;La5/g;La5/g;)V

    invoke-static {v1}, La5/e;->b(La5/g;)La5/g;

    move-result-object p1

    iput-object p1, p0, Lz4/e0;->f:La5/g;

    new-instance p2, Lz4/o;

    invoke-direct {p2, p1}, Lz4/o;-><init>(La5/g;)V

    invoke-static {p2}, La5/e;->b(La5/g;)La5/g;

    move-result-object p1

    iput-object p1, p0, Lz4/e0;->g:La5/g;

    return-void
.end method


# virtual methods
.method public final a()Lz4/b;
    .locals 1

    iget-object v0, p0, Lz4/e0;->g:La5/g;

    invoke-interface {v0}, La5/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz4/b;

    return-object v0
.end method
