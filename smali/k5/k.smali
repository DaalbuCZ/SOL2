.class public final synthetic Lk5/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/b;


# instance fields
.field public final synthetic a:Lk5/o;

.field public final synthetic b:Lk5/c;


# direct methods
.method public synthetic constructor <init>(Lk5/o;Lk5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/k;->a:Lk5/o;

    iput-object p2, p0, Lk5/k;->b:Lk5/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk5/k;->a:Lk5/o;

    iget-object v1, p0, Lk5/k;->b:Lk5/c;

    invoke-static {v0, v1}, Lk5/o;->j(Lk5/o;Lk5/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
