.class final Lu4/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/e;


# instance fields
.field private final a:Lu4/e0;

.field private final b:Lv4/g;

.field private final c:Lv4/g;

.field private final d:Lv4/g;

.field private final e:Lv4/g;

.field private final f:Lv4/g;

.field private final g:Lv4/g;


# direct methods
.method synthetic constructor <init>(Lu4/n;Lu4/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lu4/e0;->a:Lu4/e0;

    new-instance p2, Lu4/p;

    invoke-direct {p2, p1}, Lu4/p;-><init>(Lu4/n;)V

    iput-object p2, p0, Lu4/e0;->b:Lv4/g;

    new-instance p1, Lu4/z;

    invoke-direct {p1, p2}, Lu4/z;-><init>(Lv4/g;)V

    invoke-static {p1}, Lv4/e;->b(Lv4/g;)Lv4/g;

    move-result-object p1

    iput-object p1, p0, Lu4/e0;->c:Lv4/g;

    new-instance v0, Lu4/x;

    invoke-direct {v0, p2, p1}, Lu4/x;-><init>(Lv4/g;Lv4/g;)V

    invoke-static {v0}, Lv4/e;->b(Lv4/g;)Lv4/g;

    move-result-object p1

    iput-object p1, p0, Lu4/e0;->d:Lv4/g;

    new-instance v0, Lu4/j;

    invoke-direct {v0, p2}, Lu4/j;-><init>(Lv4/g;)V

    invoke-static {v0}, Lv4/e;->b(Lv4/g;)Lv4/g;

    move-result-object v0

    iput-object v0, p0, Lu4/e0;->e:Lv4/g;

    new-instance v1, Lu4/m;

    invoke-direct {v1, p1, v0, p2}, Lu4/m;-><init>(Lv4/g;Lv4/g;Lv4/g;)V

    invoke-static {v1}, Lv4/e;->b(Lv4/g;)Lv4/g;

    move-result-object p1

    iput-object p1, p0, Lu4/e0;->f:Lv4/g;

    new-instance p2, Lu4/o;

    invoke-direct {p2, p1}, Lu4/o;-><init>(Lv4/g;)V

    invoke-static {p2}, Lv4/e;->b(Lv4/g;)Lv4/g;

    move-result-object p1

    iput-object p1, p0, Lu4/e0;->g:Lv4/g;

    return-void
.end method


# virtual methods
.method public final a()Lu4/b;
    .locals 1

    iget-object v0, p0, Lu4/e0;->g:Lv4/g;

    invoke-interface {v0}, Lv4/g;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu4/b;

    return-object v0
.end method
