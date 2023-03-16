.class final Lv9/c$a;
.super Lk9/l;
.source ""

# interfaces
.implements Lj9/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv9/c;-><init>(Lu9/c;Lb9/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/l;",
        "Lj9/p<",
        "Ljava/lang/Integer;",
        "Lb9/g$b;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final o:Lv9/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv9/c$a;

    invoke-direct {v0}, Lv9/c$a;-><init>()V

    sput-object v0, Lv9/c$a;->o:Lv9/c$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lk9/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILb9/g$b;)Ljava/lang/Integer;
    .locals 0

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lb9/g$b;

    invoke-virtual {p0, p1, p2}, Lv9/c$a;->a(ILb9/g$b;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
