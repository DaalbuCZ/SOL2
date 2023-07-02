.class final Ly9/n$b;
.super Ls9/l;
.source ""

# interfaces
.implements Lr9/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/n;->M(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lx9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls9/l;",
        "Lr9/l<",
        "Lv9/c;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic o:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Ly9/n$b;->o:Ljava/lang/CharSequence;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ls9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv9/c;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly9/n$b;->o:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ly9/n;->O(Ljava/lang/CharSequence;Lv9/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv9/c;

    invoke-virtual {p0, p1}, Ly9/n$b;->a(Lv9/c;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
